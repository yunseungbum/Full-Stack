import React from 'react';
import { View, Text } from 'react-native';

const Total = ({ sum }) => {
    const total = sum.reduce((a, num) => a + num, 0); // 배열의 합 계산

    return (
        <View style={{ marginTop: 20 }}>
            <Text style={{ fontSize: 20 }}>Total: {total}</Text>
        </View>
    );
};

export default Total;