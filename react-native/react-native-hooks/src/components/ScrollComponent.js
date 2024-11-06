import React from "react";
import {View, Text, ScrollView, StyleSheet} from 'react-native';
import { useScrollPosition } from "../hooks/useScrollPosition";


const ScrollComponent = () => {

    //useScrollPosition) 훅을 호출하여 스크롤 위치(scrollPosition)과 스크롤 이벤트 처리함수(handleScroll)을 구조 분해
    const{scrollPosition, handleScroll} = useScrollPosition();

    return(
        <ScrollView // 스크롤 가능한 영역을 만듦
            style = {[styles.container,

                    //scrollPosition > 100: 스크롤 위치가 100을 초과하면 배경색을 lightblue로 설정하고, 아니면 lightcoral로 설정
                    {backgroundColor : scrollPosition > 100 ? 'lightblue' : 'lightcoral',
                        
                    }]}
            onScroll={handleScroll}//스크롤이 발생할 때마다 handeScroll 함수가 호출
            >
                <View  style={styles.content}>
                    <Text style={styles.text}>스크롤 위치에 따라 배경색이 바뀌어요!</Text>

                    {/* toFixed(자리수) :  지정된 소수점 자리수에서 반올림 해주고 문자열로 반환하는 메서드 */}
                    <Text style={styles.text}>현재 스크롤 위치:{scrollPosition.toFixed(0)}px</Text>
                </View>

        </ScrollView>
    )
}

const styles = StyleSheet.create({

    container : {
        flex:1,
        marginLeft : 10,
        marginRight : 10
    },
    content : {
        height: 1000,
        alignItems: 'center',
        justifyContent: 'center'
    },
    text:{
        fontSize: 24,
        color: 'white',
        textAlign: 'center',
        marginVertical:20
    }
})

export default ScrollComponent;