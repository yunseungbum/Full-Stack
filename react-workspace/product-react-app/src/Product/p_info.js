import React from 'react';
import { useState,useEffect } from 'react';
import '../css/p_info.css'
import { call } from '../service/ApiService';
import AddProduct from './AddProduct';
import OrderInfo from './order_info';





  
 function P_info(){
   
    //상품정보를 가지고 있는 state
    const [items, setItems] = useState([])

    //추가창을 띄우는 state
    const [open, setOpen] = useState(true);

    //라디오버튼의 index를 저장하는 state
    const[selectedIndex, setSelectedIndex] = useState(null);

    //주문개수를 저장하는 state
    const [orderCount, setOrderCount] = useState('');  
    
    // 주문 내역을 렌더링할지 여부를 제어하는 state
    const [showOrderInfo, setShowOrderInfo] = useState(false);
    useEffect(()=>{
        call("/products","GET")
        .then(result => {
            setItems(result.data);
        })
    },[])

    const addItem = (item) => {
        call("/products","POST",item)
        .then(result => setItems(result.data))
      }
 

    //onButtonClick함수 작성
    const onButtonClick = ()=>{
        setOpen(false);
    }

     //클릭한 라디오버튼의 index
     const handleRadioChange = (index) => {
        setSelectedIndex(index);
        setOrderCount(''); // 라디오 버튼 선택 시 주문 개수를 초기화
    };

    console.log("누른 라디오버튼 : "+selectedIndex);

    // 주문 개수 변경 시 호출되는 함수
    const handleOrderCountChange = (event) => {
        setOrderCount(event.target.value);
    };

    const orderProduct = () => {
        //주물하기 전에 유효성검사
        if(selectedIndex && orderCount > 0 && items[selectedIndex-1]){
            const orderData = {
                productId : items[selectedIndex -1].productId,
                productCount : parseInt(orderCount)
            }
            call("/orders","POST",orderData)
            .then(result => {setItems(result.data)})
           
        
        } else{
            alert("상품을 선택하고 개수를 입력하세요")
        }
    }

    let productItems = items.length > 0 && (
        <div>
        <table border="1">
            
            <tr>
                <th> 단일 선택 </th>
                <th> 주문 개수 </th>
                <th> 상품 번호 </th>
                <th> 상품 이름 </th>
                <th> 상품 재고 </th>
                <th> 상품 가격 </th>
                <th> 등록 날짜 </th>
                <th> 수정 날짜 </th>
            </tr>

            {/*map 함수의 특징 index를 설정할수 있다.*/}
            {items.map((item,index) => (
                
                <tr key={item.productId}>
                <td><input type="radio" name="productId" onChange={() => handleRadioChange(index+1)}
                  checked={selectedIndex === index+1}/></td>
                <td><input 
                       type="number"
                       value={selectedIndex === index + 1 ? orderCount : ''}
                       onChange={handleOrderCountChange}
                       readOnly={selectedIndex !== index + 1} /></td>
                    <td>{item.id}</td>
                    <td>{item.name}</td>
                    <td>{item.stock}</td>
                    <td>{item.price}</td>
                    <td>{item.registerDate}</td>
                    <td>{item.updateDate}</td>
                </tr>
            ))}
        </table>
        <button>주문완료</button><button>주문내역</button>
        </div>
    );
    //버튼
    let addProduct = <button type="button" onClick={onButtonClick}>상품추가</button>

    //추가창
    let addProductScreen = <AddProduct addItem={addItem} setOpen={setOpen}/>

    let addButton = addProduct;

    //open이 false가 되면 상품추가 창을 연다.
    if(!open){
    addButton = addProductScreen;
    }



    return(
        <div className='container'>
           {addButton}
            {productItems}
        </div>
    );
}

export default P_info;