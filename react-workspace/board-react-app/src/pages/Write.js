import React from 'react';
import '../css/Write.css';
import { useNavigate } from 'react-router-dom';

const Write = () => {
    const navigate = useNavigate();

    return (
        <div className='write-container'>
            <h2 className='write-title'>글쓰기</h2>
            <div className='write-input-group'>
                <input className='write-input' type='text' placeholder='제목' />
            </div>
            <div className='write-input-group'>
                <input className='write-input' type='text' placeholder='작성자' />
            </div>
            <div className='write-input-group'>
                <textarea className='write-textarea' placeholder='내용'></textarea>
            </div>
            <div className='write-buttons'>
                <button className='write-button save'>저장</button>
                <button className='write-button cancel' onClick={() => navigate('/')}>취소</button>
            </div>
        </div>
    );
};

export default Write;
