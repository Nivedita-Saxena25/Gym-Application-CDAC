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

    document.title = 'Monster gym - Unidades'

  return (
    <S.All>
        <NavBar />
        <ToTop />
        <S.SearchArea>
            <SearchIcon className='icon'/>
            <h1>Pesquisar por cidade</h1>
            <TextField id="outlined-search"
                value={search} label="Pesquisar "
                type="text" onChange={(e)=>setSearch(e.target.value)}
                style={{borderColor: '#ff0022', borderWidth: '2px'}}
                classes={{root: "inputmaterial"}} color='error' autoComplete="off"
            />
        </S.SearchArea>
        <FormControl color='error' classes={{root: "selectState"}}>
            <InputLabel id="demo-simple-select-label">Estado</InputLabel>
            <Select labelId="demo-simple-select-label"
            id="demo-simple-select" value={filt} label="Estado"
            onChange={handleChange}>
                <MenuItem id='item' value=''></MenuItem> 
                <MenuItem id='item' value='São Paulo'>São Paulo</MenuItem>
                <MenuItem id='item' value='Mineas Gerais'>Mineas Gerais</MenuItem>
                <MenuItem id='item' value='Bahia'>Bahia</MenuItem>
                <MenuItem id='item' value='Paraná'>Paraná</MenuItem>
                <MenuItem id='item' value='Santa Catarina'>Santa Catarina</MenuItem>
                <MenuItem id='item' value='Rio Grande do Sul'>Rio Grande do Sul</MenuItem>
                <MenuItem id='item' value='Rio de Janeiro'>Rio de Janeiro</MenuItem>
            </Select>
        </FormControl>
        <S.Container>
            {resultSelect.map((item, key)=>(
                <S.Item ina={item.inauguracao} key={key}>
                    <S.ItemImageArea>
                        <S.Aviso ina={item.inauguracao}>
                            Inauguração!
                        </S.Aviso>
                        <img src={item.academia_img} alt='academia img'/>
                    </S.ItemImageArea>
                    <S.ItemValor ina={item.inauguracao}>
                        <p style={{fontSize: '18px'}}>Planos a partir de</p>
                        <S.Valor>R$ {item.valor}</S.Valor>
                    </S.ItemValor>
                    <S.Cidade>{item.cidade}</S.Cidade>
                    <S.ItemDesc>{item.endereco}</S.ItemDesc>
                    <S.Button ina={item.inauguracao}>Ver mais</S.Button>
                </S.Item>
            ))}
        </S.Container>
        <Footer />
    </S.All>
  )
}
