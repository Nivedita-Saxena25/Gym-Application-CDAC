import React from 'react'
import * as S from './styled'
import mod1 from '../../assets/icon modalidades/bike.png'
import mod2 from '../../assets/icon modalidades/boxing.png'
import mod3 from '../../assets/icon modalidades/dance.png'
import mod5 from '../../assets/icon modalidades/judo.png'
import mod6 from '../../assets/icon modalidades/karate.png'
import mod7 from '../../assets/icon modalidades/musculacao.png'
import mod8 from '../../assets/icon modalidades/natação.png'
import mod9 from '../../assets/icon modalidades/yoga.png'

export default function index() {
  return (
    <S.Container>
        <h2 id='modalidades'>Modalidades</h2>

        <S.ModalidadesFlex>
            <S.ModalidadeItem>
                <img src={mod1} alt='Bike indoor'/>
                <h3>bike indoor</h3>
            </S.ModalidadeItem>

            <S.ModalidadeItem>
                <img src={mod2} alt='Boxe' />
                <h3>Boxe</h3>
            </S.ModalidadeItem>

            <S.ModalidadeItem>
                <img src={mod3} alt='Dance fitness' />
                <h3>Dance fitness</h3>
            </S.ModalidadeItem>

            <S.ModalidadeItem>
                <img src={mod5} alt='Judô' />
                <h3>Judô</h3>
            </S.ModalidadeItem>

            <S.ModalidadeItem>
                <img src={mod6} alt='Karatê' />
                <h3>Karatê</h3>
            </S.ModalidadeItem>

            <S.ModalidadeItem>
                <img src={mod7} alt='Musculação' />
                <h3>Musculação</h3>
            </S.ModalidadeItem>

            <S.ModalidadeItem>
                <img src={mod8} alt='Natação' />
                <h3>Natação</h3>
            </S.ModalidadeItem>

            <S.ModalidadeItem>
                <img src={mod9} alt='Yoga' />
                <h3>Yoga</h3>
            </S.ModalidadeItem>
        </S.ModalidadesFlex>
    </S.Container>
  )
}
