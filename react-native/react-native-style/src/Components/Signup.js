import React from "react";
import { View,Text,TextInput,StyleSheet } from "react-native";
import Button from "./Button";


export  const Headers = () => {
    return(
        <View>
            <Text style={{

                     padding: 20,
                     justifyContent: 'flex-start',
                     alignItems: 'center',
                     marginBottom:70,
                     fontSize :25 }}>
                        회원가입</Text>

        </View>

    );
}



export const Signup = () => {
    return(
        <View>
            
        
                <View style={{
                fontSize:30
            }}>
                <Text>이름</Text>
                <TextInput 
                 style={styles.input} 
                 placeholder="이름을 입력하세요" 
                    />
                </View>

                <View>
                <Text>이메일</Text>
                <TextInput 
                 style={styles.input} 
                 placeholder="이메일을 입력하세요" 
                    />
                </View>

                <View>
                <Text>비밀번호</Text>
                <TextInput 
                 style={styles.input} 
                 placeholder="비밀번호를 입력하세요" 
                    />
                </View>

                <View>
                <Text>비밀번호 확인</Text>
                <TextInput 
                 style={{ width: 350,
                    borderWidth: 1,
                    borderColor: '#black',
                    borderRadius: 5,
                    padding: 10,
                    marginBottom:130,
                    marginTop:5
                 }} 
                 placeholder="비밀번호를  재입력하세요" 
                    />
                </View>

        </View>
    
)
}

export const LoginCheck = () => {

  return(
      <View>
          <Button style= {styles.flex}>회원가입</Button>
      </View>
  )
}




const styles = StyleSheet.create({
    container: {
        padding: 20,
        justifyContent: 'flex-start',
        alignItems: 'center'
    },
    input: {
        width: 350,
        borderWidth: 1,
      borderColor: '#black',
      borderRadius: 5,
      padding: 10,
      marginBottom: 20,
      marginTop:5
     
    },
    flex:{
        flex:2
    }
  });




