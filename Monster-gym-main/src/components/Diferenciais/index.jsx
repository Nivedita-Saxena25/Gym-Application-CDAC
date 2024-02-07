import React from 'react'
import * as S from './style'

export default function index() {
  return (
    <S.Container>
        <S.Box>
            <img alt='icon' src='https://cdn-icons-png.flaticon.com/512/3113/3113330.png' />
            <p>Na Monster gym você é livre para ser quem você quiser.
                Não existe padrões ou requisitos, só a vontade de estar bem com você mesmo.
            </p>
        </S.Box>
        <S.Box>
            <img alt='icon' src='https://cdn-icons-png.flaticon.com/512/166/166516.png' />
            <p>Criamos um ambiente e profissionais que te deixam a vontade e com alto astral
                para alcançar suas metas de forma objetiva e divertida.
            </p>
        </S.Box>
        <S.Box>
            <img alt='icon' src='https://cdn-icons-png.flaticon.com/512/1584/1584858.png' />
            <p>Projetamos um conceito de academia com horários e grade de aulas para que
                você ajuste o o treino do seu jeito.
            </p>
        </S.Box>
    </S.Container>
  )
}
