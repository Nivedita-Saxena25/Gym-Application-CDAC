import React, { useState } from "react";
import * as S from "./style";
import logoText from "../../assets/muscle_logo.png";
import { Link } from "react-router-dom";
import { Spin as Hamburger } from "hamburger-react";

export default function Index() {
  const [openMenu, setOpenMenu] = useState(false);

  const handleOpenMenu = () => {
    setOpenMenu(!openMenu);
  };

  return (
    <S.Nav style={{ position: "fixed", width: "100%", top: 0, backgroundColor: "#333" }}>
      <S.BackNav onClick={handleOpenMenu} show={openMenu}></S.BackNav>
      <Link to="/">
        <S.NavImg src={logoText} alt="logo" />
      </Link>
      <S.NavItems showMenu={openMenu}>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/unidades">Facilities</Link>
        </li>
        <li>
          <Link to="/modalidades">About Us</Link>
        </li>
        <li>
          <Link to="/planos">Plans</Link>
        </li>
        <li>
          <Link to="/entrar">Contact Us </Link>
        </li>
        <S.NavButton2>
          <Link to="/cadastro">Enroll now!</Link>
        </S.NavButton2>
      </S.NavItems>
      <S.NavButton>
        <Link to="/cadastro">Register Now!</Link>
      </S.NavButton>
      <S.HamburgerArea onClick={handleOpenMenu}>
        <Hamburger color="#ff0022" toggled={openMenu} toggle={setOpenMenu} />
      </S.HamburgerArea>
    </S.Nav>
  );
}
