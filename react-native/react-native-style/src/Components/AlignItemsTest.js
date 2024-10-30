import React,{useState}from 'react';
import { View, Text, Button } from 'react-native';
import {box_styles} from '../Styles';

const AlignItemsTest = () => {
    const [alignItems, setAlignItems] = useState('flex-start');

    return (
        <View style={box_styles.container}>
            <Text style={box_styles.title}>alignItemsTest: {alignItems}</Text>
            <View style={[box_styles.boxContainer, { alignItems: alignItems }]}>
                <View style={box_styles.box}><Text style={box_styles.boxText}>1</Text></View>
                <View style={box_styles.box}><Text style={box_styles.boxText}>2</Text></View>
                <View style={box_styles.box}><Text style={box_styles.boxText}>3</Text></View>
            </View>

            <View style={box_styles.buttons}>
                <Button title="Flex Start" onPress={() => setAlignItems('flex-start')} />
                <Button title="Center" onPress={() => setAlignItems('center')} />
                <Button title="Flex End" onPress={() => setAlignItems('flex-end')} />
                <Button title="Stretch" onPress={() => setAlignItems('stretch')} />
            </View>
        </View>
    );
};

export default AlignItemsTest;