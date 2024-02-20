import React from "react";
import * as S from "./style";
import Logo from "../../assets/logo_master.png";
import Instagram from "../../assets/instagram.png";
import Facebook from "../../assets/facebook.png";

export default function index() {
  return (
    <S.Container>
      <S.Email>
        <p
          style={{ fontSize: "26px", marginBottom: "-0.1em", fontWeight: 600 }}
        >
          Do you want to receive our news?
        </p>
        <p style={{ opacity: "75%", fontSize: "17px", marginBottom: "1em" }}>
          Get early access to tailor-made updates just for you!
        </p>
        <S.Input>
          <input
            placeholder="Enter your email address"
            type="email"
            style={{ padding: ".5em 1em" }}
          />
          <button>Register</button>
        </S.Input>
      </S.Email>

      <S.ContainerAreaInfo>
        <S.LogoArea>
          <S.LogoImage src={Logo} />
          <S.SocialArea>
            <S.SocialItem src={Instagram} />
            <S.SocialItem src={Facebook} />
          </S.SocialArea>
        </S.LogoArea>
        <S.Uls>
          <S.Contato>
            <h4>CONTACT</h4>
            <S.ContatoItem>contact@monstergym.com.br</S.ContatoItem>
            <S.ContatoItem>
              Bavdhan near Bank Of Maharashtra, NDA Pashan Road Tq-Mulshi,
              Dis-Pune
            </S.ContatoItem>
            <S.ContatoItem>CEP: 14091-413</S.ContatoItem>
            <S.ContatoItem>(16) 1234-5678</S.ContatoItem>
          </S.Contato>
          <S.Horario>
            <h4>OPERATION</h4>
            <S.HorarioInfo>
              <S.HorariosItemDia>
                <S.HorariosItem>"Mon - Fri"</S.HorariosItem>
                <S.HorariosItem>Sat - Sun</S.HorariosItem>
              </S.HorariosItemDia>
              <S.HorariosItemHora>
                <S.HorariosItem>6h - 22h</S.HorariosItem>
                <S.HorariosItem>8h- 15h</S.HorariosItem>
              </S.HorariosItemHora>
            </S.HorarioInfo>
          </S.Horario>
        </S.Uls>
      </S.ContainerAreaInfo>
    </S.Container>
  );
}
