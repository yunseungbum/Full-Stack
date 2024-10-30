import { StatusBar } from 'expo-status-bar';
import { Fragment } from 'react';
import { StyleSheet, Text, View } from 'react-native';
import MyButton from './components/MyComponent';
import Counter from './components/Counter';
import ToggleText from './components/Toggle';
import Total from './components/Total';
import ItemList from './components/ItemList';
import EventButton from './components/EventButton';
import EventInput from './components/EventInput';
import  Button  from './components/PressAbleTest';


export default function App() {

  const name = 'Gil-Dong';

  let arr = [1,2,3,4,5,6,7,8,9,10];

  let fruits = ['apple','banana','orange','watermallon'];
  

      //if 조건문
        
        //   {(()=>{
        //   if(name ==='Hanbit') return 'My name is Hanbit';
        //   else if(name === 'Gil-Dong') return 'My name is Gil-Dong';
        //   else return 'My name is React Native';
        // })()}
          


       //삼항연산자
       {/*
        {(()=>{
        if(name ==='Hanbit') return 'My name is Hanbit';
        else if(name === 'Gil-Dong') return 'My name is Gil-Dong';
        else return 'My name is React Native';



        })()} 
        */}


      //AND 연산자와 OR연산자
      {/*
         {name === 'Gil-Dong' &&(
        <Text style={styles.text}> My name is Gil-Dong</Text>
      )}
      {name !== 'Gil-Dong' ||(
        <Text style={styles.text}> My name is not Gil-Dong</Text>
      )}
        */}

      //스타일링
      {/*
         return (
      <View style={{flex:1,
      backgroundColor:'#fff',
      alignItems: 'center',
      justifyContent: 'center'
       }}>
      <Text>Open up App.js to start working on your app!</Text>
      <StatusBar style="auto" />
       </View>
  );
        */}
 

  return(
    <View
        style={{
            flex:1,
            backgroundColor:'#fff',
            alignItems: 'center',
            justifyContent: 'center'
        }}
    >
        {/* <Text style={{fontSize:30, marginBottom:10}}>Button Component</Text> */}
        {/* {<Button title="button" color='red' onPress={()=> alert('Click!!')}/>} */}
        {/*부모 컴포넌트에서 자식 컴포넌트를 사용하면서 속성으로 props를 전달하는 방법 외에 컴포넌트 사이에서
          값을 입력해서 전달하는 방법도 있다*/}
          {/* <MyButton title="Button" onPress={() => alert('wait..')}/>
          <MyButton title="Button"onPress={() => alert('children')} >Children Props</MyButton>
          <MyButton  onPress={() => alert('default')}/> */}
            {/* <Counter/>
            <ToggleText/>
            <Total sum={arr}/>
            <ItemList fruits = {fruits}/> */}
            {/* <EventButton />
            <EventInput /> */}
            <Button title='pressable'/>
          
    </View>
)
}


