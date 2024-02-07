import React from 'react'
import * as S from './style'

export default function index() {
  return (
    <S.Container>
        <S.InfoText>Melhor recepção, melhor estrutura... melhor academia que já treinei.</S.InfoText>
        <S.InfoArea2>
            <img alt='usuario' src='https://i.pinimg.com/736x/a2/d5/fa/a2d5fa68cc639796d06de5f00e07ae1e.jpg' />
            <S.InfoName>
                <p style={{fontSize: '20px'}}>Lídia C. Fogaça</p>
                <p style={{opacity: '40%'}}>Aluna</p>
            </S.InfoName>
        </S.InfoArea2>
    </S.Container>
  )
}
