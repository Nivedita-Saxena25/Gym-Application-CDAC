import React from 'react'
import * as S from './style'
import img1 from '../../assets/img1_00000.png'
import CheckIcon from '../../assets/check.png'

export default function index() {
  return (
    <S.Container>
        <S.ContainerInfo>
            <S.Image src={img1} alt='Homem  fazendo musulação'/>
            <S.InfoBeneficios>
                <h2>Por que escolher a Monster gym?</h2>
                <S.Image2 src={img1} alt='Homem fazendo musulação'/>
                <S.InfoItem>
                    <img src={CheckIcon} alt='check'/>
                    <p>+140 personal trainers especializados</p>
                </S.InfoItem>
                <S.InfoItem>
                    <img src={CheckIcon} alt='check'/>
                    <p>1º treino/aula grátis para novos mebros</p>
                </S.InfoItem>
                <S.InfoItem>
                    <img src={CheckIcon} alt='check'/>
                    <p>Monster GO (treinos online)</p>
                </S.InfoItem>
                <S.InfoItem>
                    <img src={CheckIcon} alt='check'/>
                    <p>Equipamentos modernos</p>
                </S.InfoItem>
            </S.InfoBeneficios>
        </S.ContainerInfo>
    </S.Container>
  )
}
