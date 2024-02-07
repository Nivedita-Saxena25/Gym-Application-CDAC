import React from 'react'
import * as S from './style'

export default function index() {
  return (
    <S.Container>
        <S.InfoText>Ótima academia, professores pegam no pé mesmo, não tem moleza não rsrsrs. Super recomendo!!!!</S.InfoText>
        <S.InfoArea2>
            <img alt='usuario' src='https://cdn.ocp.news/2021/09/eduardo_2.jpg' />
            <S.InfoName>
                <p style={{fontSize: '20px'}}>Bruno Marçal</p>
                <p style={{opacity: '40%'}}>Aluna</p>
            </S.InfoName>
        </S.InfoArea2>
    </S.Container>
  )
}
