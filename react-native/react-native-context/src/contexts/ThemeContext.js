import React ,{createContext,useState} from "react";



export const ThemeContext = createContext();



const ThemeProvider = ({children}) => {

    const[isDarkMode,setIsDarkMode] = useState(false);
    const toggleTheme = () => setIsDarkMode(prev => !prev);

    return(
        <ThemeContext.Provider value={{isDarkMode,toggleTheme}}>
            {children}
        </ThemeContext.Provider>
    )
}
export default ThemeProvider;