import './style.css'
import React, { useState } from 'react'
import JSONResult from './unity.json'
import * as S from './style'
import NavBar from '../../components/Navbar'
import Footer from '../../components/Footer'
import ToTop from '../../components/ToTop'

import TextField from '@mui/material/TextField';
import SearchIcon from '@mui/icons-material/Search';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';

export default function Index() {
    
    const [search, setSearch] = useState('')
    const [filt, setFilt] = useState('');

    const handleChange = (event) => {
        setFilt(event.target.value);
    };

    const resultSearch = JSONResult.filter((e) => e.estado.toLowerCase().startsWith(filt.toLowerCase()));

    const resultSelect = resultSearch.filter(e=>e.cidade.toLowerCase().startsWith(search.toLowerCase()))

    document.title = 'Monster gym - Units'

  return (
    <S.All>
        <NavBar />
        <ToTop />
        <S.SearchArea>
            <SearchIcon className='icon'/>
            <h1>Search by city</h1>
            <TextField id="outlined-search"
                value={search} label="Search "
                type="text" onChange={(e)=>setSearch(e.target.value)}
                style={{borderColor: '#ff0022', borderWidth: '2px'}}
                classes={{root: "inputmaterial"}} color='error' autoComplete="off"
            />
        </S.SearchArea>
        <FormControl color='error' classes={{root: "selectState"}}>
            <InputLabel id="demo-simple-select-label">State</InputLabel>
            <Select labelId="demo-simple-select-label"
            id="demo-simple-select" value={filt} label="Estado"
            onChange={handleChange}>
                <MenuItem id='item' value=''></MenuItem> 
                <MenuItem id='item' value='Maharashtra'>Maharashtra</MenuItem>
                <MenuItem id='item' value='Madhya Pradesh'>Madhya Pradesh</MenuItem>
                <MenuItem id='item' value='Karnataka'>Karnataka</MenuItem>
                <MenuItem id='item' value='Rajasthan'>Rajasthan</MenuItem>
                <MenuItem id='item' value='Punjab'>Punjab</MenuItem>
                <MenuItem id='item' value='Telangana'>Telangana</MenuItem>
                <MenuItem id='item' value='Goa'>Goa</MenuItem>
            </Select>
        </FormControl>
        <S.Container>
            {resultSelect.map((item, key)=>(
                <S.Item ina={item.inauguracao} key={key}>
                    <S.ItemImageArea>
                        <S.Aviso ina={item.inauguracao}>
                        Inauguration!
                        </S.Aviso>
                        <img src={item.academia_img} alt='academia img'/>
                    </S.ItemImageArea>
                    <S.ItemValor ina={item.inauguracao}>
                        <p style={{fontSize: '18px'}}>Plans starting from</p>
                        <S.Valor>Rs {item.valor}</S.Valor>
                    </S.ItemValor>
                    <S.Cidade>{item.cidade}</S.Cidade>
                    <S.ItemDesc>{item.endereco}</S.ItemDesc>
                    <S.Button ina={item.inauguracao}>See more</S.Button>
                </S.Item>
            ))}
        </S.Container>
        <Footer />
    </S.All>
  )
}
