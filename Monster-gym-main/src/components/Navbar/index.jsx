import React, { useState } from 'react'
import * as S from './style'
import logoText from '../../assets/logoText.png'
import { Link } from 'react-router-dom'
import { Spin as Hamburger } from 'hamburger-react'

export default function Index() {

    const [openMenu, setOpenMenu] = useState(false)

    const handleOpenMenu=()=>{
        setOpenMenu(!openMenu)
    }

  return (
    <S.Nav>
        <S.BackNav  onClick={handleOpenMenu} show={openMenu}></S.BackNav>
        <Link to="/"><S.NavImg src={logoText} alt='logo'/></Link>
        <S.NavItems showMenu={openMenu}>
            <li><Link to="/">Início</Link></li>
            <li><Link to="/unidades">Unidades</Link></li>
            <li><Link to="/modalidades">Modalidades</Link></li>
            <li><Link to="/planos">Planos</Link></li>
            <li><Link to="/entrar">Espaço do cliente</Link></li>
            <S.NavButton2><Link to="/cadastro">Matricule-se já!</Link></S.NavButton2>
        </S.NavItems>
        <S.NavButton><Link to="/cadastro">Matricule-se já!</Link></S.NavButton>
        <S.HamburgerArea onClick={handleOpenMenu}><Hamburger color="#ff0022" toggled={openMenu} toggle={setOpenMenu}/></S.HamburgerArea>
    </S.Nav>
  )
}
