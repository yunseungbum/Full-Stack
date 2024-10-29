import React from "react";//리엑트를 불러와서 사용할 수 있게 해주는 코드
import { Pressable, Text } from "react-native";//리엑트 네이티브에서 제공하는 Pressable,Text 컴포넌트 추가
import PropTypes from "prop-types";

const MyButton = (props) => {
    MyButton.defaultProps = {
        title:'button'
    }
     MyButton.propTypes = {
         //title: PropTypes.number  -> title에 들어오는 문자를 number로 하자라는 뜻
         title: PropTypes.string.isRequired,
         name: PropTypes.string.isRequired
     }
    // console.log(props);
    return(
        <Pressable
        style={{
            backgroundColor:'red',
            padding: 16,
            margin: 10,
            borderRadius: 8

        }}
        onPress={() => props.onPress()}
        >
            <Text style={{color: 'white', fontSize : 24}}>{props.children || props.title}</Text>
            {/* {props.chidren || props.title} : props.chidren가 있으면 props.title를 출력하지말라는 뜻*/}
        </Pressable>
    )
}

export default MyButton;