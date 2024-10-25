import React, { useState } from "react";
import { MapMarker } from "react-kakao-maps-sdk";
import { Map } from "react-kakao-maps-sdk";

function MyMap2(){

    //검색을 통해서 마커찍기

    //사용자가 클릭한 마커의 정보를 저장하는 상태
    const[info, setInfo] = useState(null);

    //지도에 표시된 마커들의 리스트 상태
    const[markers, setMarkers] = useState([]);

    //생성된 맵 객체럴 저장할 상태
    const[map, setMap] = useState(null);

    //검색어를 저장할 상태
    const[keyword, setKeyword] =useState('');

    //카카오 장소 검색 API를 호출하는 함수
  const searchPlaces = (searchKeyword) => {
    // map 객체와 카카오 지도 API가 로드되지 않았으면 함수 종료
    if (!map || !window.kakao || !window.kakao.maps || !window.kakao.maps.services) {
      return;
    }
        //카카오 장소 검색 객체 생성
        const ps = new window.kakao.maps.services.Places();

        ps.keywordSearch(searchKeyword, (data, status) => {
            // 검색이 성공적으로 완료되었을 때
            if (status === window.kakao.maps.services.Status.OK) {
              const bounds = new window.kakao.maps.LatLngBounds();  // 지도 범위를 설정하기 위한 객체 생성
              // 검색된 장소 리스트를 마커로 변환
              const newMarkers = data.map((place) => ({
                position: {
                  lat: place.y,  // 장소의 위도
                  lng: place.x,  // 장소의 경도
                },
                content: place.place_name,  // 마커에 표시할 장소명
              }));
      
              // 모든 마커의 위치를 기준으로 지도의 범위를 조정
              newMarkers.forEach(marker => bounds.extend(new window.kakao.maps.LatLng(marker.position.lat, marker.position.lng)));
              
              setMarkers(newMarkers);  // 마커 리스트를 상태로 업데이트
              map.setBounds(bounds);  // 지도를 새로 계산한 범위로 설정
            } else {
              alert('검색 결과가 없습니다.');  // 검색 결과가 없을 때 알림 메시지 표시
            }
          });
        
    }






    const handleSearch =() => {
        //검색어가 비어있을 시 경고
        if(keyword === ''){
            alert('검색어를 입력하세요');
            return;
        }

        searchPlaces(keyword);
      
    }

    return (
        <div style={{ height: '100vh', width: '100vw' }}> {/* 전체 화면을 사용하는 div */}
            {/* 검색창과 버튼 */}
            <div style={{ marginBottom: "10px" }}>
                <input
                    type="text"
                    value={keyword}
                    onChange={(e) => setKeyword(e.target.value)}
                    placeholder="검색어를 입력하세요"
                    style={{ padding: "5px", marginRight: "5px" }} />
                <button onClick={handleSearch}>검색</button>
            </div>
            {/* 지도 표시 */}
            <Map
                center={{
                    lat: 37.566433,
                    lng: 126.900000
                }}
                style={{
                    width: "100%", // 전체 폭
                    height: "calc(100% - 50px)" // 전체 높이에서 검색창 높이만큼 빼기
                }}
                level={3}
                onCreate={setMap}
            >
                {markers.map((marker, index) => (
                    <MapMarker
                        key={`marker=${index}`}
                        position={marker.position}
                        onClick={() => setInfo(marker)}
                    >
                        {/* 선택된 마커에 정보 표시 */}
                        {info && info.content === marker.content && (
                            <div style={{ color: "#000" }}>{marker.content}</div>
                        )}
                    </MapMarker>
                ))}
            </Map>
        </div>
    );
}

export default MyMap2;