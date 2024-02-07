import React from 'react'
import * as S from './style'

export default function index() {
  return (
    <S.Container>
        <S.InfoText>Bom preço, instrutores atenciosos e muitos aparelhos. Recomendo.</S.InfoText>
        <S.InfoArea2>
            <img alt='usuario' src='https://scc10.com.br/wp-content/uploads/2022/02/Barbara-Cristina-Giovanella-e1644341933794.jpg' />
            <S.InfoName>
                <p style={{fontSize: '20px'}}>Bruno Marçal</p>
                <p style={{opacity: '40%'}}>Aluna</p>
            </S.InfoName>
        </S.InfoArea2>
    </S.Container>
  )
}
