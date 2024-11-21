import React from 'react'
import { TextField } from '@mui/material'


const CustomInput =({
    label,
    type="text",
    multiline=false,
    rows =1,
    value,
    onchange,
    readOnly = false,
    placeholder ="",

})=>{
    return(
        <TextField
            fullWidth
            label={label}
            type={type}
            multiline={multiline}
            rows={rows}
            value={value}
            onChange={onchange}
            margin="normal"
            inputProps={{
                readOnly,
                placeholder,
            }}
            />
    )
}

export default CustomInput
