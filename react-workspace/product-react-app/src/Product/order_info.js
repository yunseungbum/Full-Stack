import React from 'react';
import {useState,useEffect} from 'react';
import { call } from '../service/ApiService';

function OrderInfo() {
    //주문내역을 저장할 state
    const [orderList, setOrderList] = useState([]);

    useEffect(() => {
        call("/orders", "GET")
        .then(result => {
            setOrderList(result.data);
        })
    },[])

  return (
    <div id="container">
      <table border="1">
        <thead>
          <tr>
            <th>상품 이름</th>
            <th>상품 가격</th>
            <th>주문 개수</th>
            <th>결제 금액</th>
            <th>주문 날짜</th>
          </tr>
        </thead>
        <tbody>
          {orderList.map((order) => (
            <tr key={order.orderId}>
              <td>{order.productName}</td>
              <td>{order.productPrice}</td>
              <td>{order.productCount}</td>
              <td>{order.orderPrice}</td>
              <td>{order.orderDate}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default OrderInfo;