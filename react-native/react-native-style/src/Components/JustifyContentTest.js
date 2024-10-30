import React,{useState} from 'react';
import { View, Text, Button, ScrollView } from 'react-native';
import { box_styles } from '../Styles';

const JustifyContentTest = () => {
    const [justifyContent, setJustifyContent] = useState('flex-start');

    return (
        <View style={box_styles.container}>
            <Text style={box_styles.title}>justifyContentTest: {justifyContent}</Text>
            <View style={[box_styles.boxContainer, { justifyContent: justifyContent }]}>
                <View style={box_styles.box}><Text style={box_styles.boxText}>1</Text></View>
                <View style={box_styles.box}><Text style={box_styles.boxText}>2</Text></View>
                <View style={box_styles.box}><Text style={box_styles.boxText}>3</Text></View>
            </View>
        <ScrollView horizontal>
            <View style={box_styles.buttons}>
                <Button title="Flex Start" onPress={() => setJustifyContent('flex-start')} />
                <Button title="Center" onPress={() => setJustifyContent('center')} />
                <Button title="Flex End" onPress={() => setJustifyContent('flex-end')} />
                <Button title="Space Between" onPress={() => setJustifyContent('space-between')} />
                <Button title="Space Around" onPress={() => setJustifyContent('space-around')} />
                <Button title="Space Evenly" onPress={() => setJustifyContent('space-evenly')} />
            </View>
        </ScrollView>
        </View>
    );
};

export default JustifyContentTest;