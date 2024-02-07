import React, { useState, useEffect } from 'react'
import * as S from './style'
import JSONResult from './modalities.json'
import NavBar from '../../components/Navbar'
import Footer from '../../components/Footer'
import ToTop from '../../components/ToTop'
import BG from '../../assets/bg modalidades.png'

export default function Index() {

    const [result, setResult] = useState([])

    useEffect(()=>{
        setResult(JSONResult)
    },[])

    document.title = 'Monster gym - modalidades'
  return (
    <S.All>
        <NavBar />
        <ToTop />
        <S.HeaderArea>
            <h1>Modalidades</h1>
            <img src={BG} alt='background'/>
        </S.HeaderArea>
        <S.Container>
            {result.map((item, key)=>(
                <S.Item key={key}>
                    <img src={item.icon_img} alt='modalidade'/>
                    <S.ItemNome>{item.nome}</S.ItemNome>
                    <S.ItemDesc>{item.desc}</S.ItemDesc>
                    <S.Button>Ver mais</S.Button>
                </S.Item>
            ))}
        </S.Container>
        <Footer />
    </S.All>
  )
}
