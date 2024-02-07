import React from "react";
import * as S from "./style";
import BG from "../../assets/bg.png";
import LogoMaster from "../../assets/logo_master.png";

export default function index() {
  return (
    <S.Container>
      <S.ContainerInfo>
        <img src={LogoMaster} alt="logo" />
        <h1>
          Set free the <span>Monster</span> within you
        </h1>
      </S.ContainerInfo>
      <S.Bg src={BG} alt="Background" />
      <S.Grad></S.Grad>
    </S.Container>
  );
}
