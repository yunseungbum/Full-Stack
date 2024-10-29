import React from "react";
import { View, Text } from "react-native";

// 기본 내보내기와 함께 컴포넌트 정의
const ItemList = ({ fruits }) => {
    return (
        <View>
            {fruits.map((item, index) => (
                <Text key={index}>{item}</Text>
            ))}
        </View>
    );
};

export default ItemList;