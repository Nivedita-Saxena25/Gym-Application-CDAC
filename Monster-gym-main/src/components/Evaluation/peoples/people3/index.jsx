import React from 'react'
import * as S from './style'

export default function index() {
  return (
    <S.Container>
        <S.InfoText>Amo a academia. Atendimento maravilhoso, lugar onde me sinto muito bem. Os professores são top.</S.InfoText>
        <S.InfoArea2>
            <img alt='usuario' src='https://love-br.com/oc-content/uploads/23/2554.jpg' />
            <S.InfoName>
                <p style={{fontSize: '20px'}}>Bruno Marçal</p>
                <p style={{opacity: '40%'}}>Aluna</p>
            </S.InfoName>
        </S.InfoArea2>
    </S.Container>
  )
}
