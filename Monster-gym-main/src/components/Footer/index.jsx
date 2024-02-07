import React from 'react'
import * as S from './style'
import Logo from '../../assets/logo_master.png'
import Instagram from '../../assets/instagram.png'
import Facebook from '../../assets/facebook.png'

export default function index() {
  return (
    <S.Container>
        <S.Email>
            <p style={{fontSize: '26px', marginBottom: '-0.1em', fontWeight: 600}}>Deseja receber nossas novidades?</p>
            <p style={{opacity: '75%', fontSize: '17px', marginBottom: '1em'}}>Ganhe acesso antecipado as novidades sob medida para você!</p>
            <S.Input>
                <input placeholder='Digite o seu melhor e-mail' type='email' style={{padding: '.5em 1em'}}/>
                <button>Cadastrar</button>
            </S.Input>
        </S.Email>

        <S.ContainerAreaInfo>
            <S.LogoArea>
                <S.LogoImage src={Logo} />
                <S.SocialArea>
                    <S.SocialItem src={Instagram}/>
                    <S.SocialItem src={Facebook}/>
                </S.SocialArea>
            </S.LogoArea>
            <S.Uls>
                <S.Contato>
                    <h4>CONTATO</h4>
                    <S.ContatoItem>contato@monstergym.com.br</S.ContatoItem>
                    <S.ContatoItem>Av. Antônio Diederichsen, 389 - Jardim America, Ribeirão Preto</S.ContatoItem>
                    <S.ContatoItem>CEP: 14091-413</S.ContatoItem>
                    <S.ContatoItem>(16) 1234-5678</S.ContatoItem>
                </S.Contato>
                <S.Horario>
                    <h4>FUNCIONAMENTO</h4>
                    <S.HorarioInfo>
                        <S.HorariosItemDia>
                            <S.HorariosItem>Seg - Sex</S.HorariosItem>
                            <S.HorariosItem>Sáb - Dom</S.HorariosItem>
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
  )
}
