import React from 'react';
import { useState,useEffect } from 'react';
import './css/p_info.css'
import { call } from './service/ApiService';
import AddProduct from './AddProduct';


 function P_info(){
    const [items,setItems] = useState([]);
    const [open, setOpen] = useState(true);

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


    
    let productItems = items.length > 0 && (
        <table border="1">
            <tr>
                <th> 상품 번호 </th>
                <th> 상품 이름 </th>
                <th> 상품 재고 </th>
                <th> 상품 가격 </th>
                <th> 등록 날짜 </th>
                <th> 수정 날짜 </th>
            </tr>
            {items.map((item) => (
                <tr>
                    <th>{item.id}</th>
                    <th>{item.name}</th>
                    <th>{item.stock}</th>
                    <th>{item.price}</th>
                    <th>{item.registerDate}</th>
                    <th>{item.updateDate}</th>
                </tr>
            ))}
        </table>
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