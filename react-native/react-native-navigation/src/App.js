import React from "react";
import { NavigationContainer} from '@react-navigation/native';
import StackNavigation from "./navigations/Stack";
import TabNavigation from "./navigations/Tab";
import BookStackNavigaion from "./navigations/BookStack";
import UserStackNavigation from "./navigations/UserStack";
import ShopTabNavitaion from "./navigations/ShopTab";
import ChatStackNavigaion from "./navigations/StackChat";
import ChatTabNavigation from "./navigations/TabChat";
import DrawerNavigation from "./navigations/Drawer";



const App = () => {
    return(
    <NavigationContainer>
        {/* <BookStackNavigaion /> */}

        {/* <UserStackNavigation/> */}
        {/* <TabNavigation/>*/}
        {/* <ShopTabNavitaion/> */}
        
        {/* <ChatTabNavigation/> */}


        <DrawerNavigation/>
    </NavigationContainer>
    

    )
}

export default App;