import React from 'react'
import * as S from './style'
import { Link } from 'react-router-dom'
import CheckIcon from '../../assets/check.png'
import CheckIconWhite from '../../assets/check_white.png'
import dumbbell from '../../assets/dumbbell.png'
import cardio from '../../assets/cardio.png'
import coroa from '../../assets/coroa_00000.png'

export default function index() {
  return (
    <S.Container>
        <h2>Comece sua jornada conosco agora!</h2>
        <S.Plans>
            <S.Plan>
                <img src={dumbbell} alt='icon'/>
                <p style={{fontSize: '28px'}}>Plano Básico</p>
                <p style={{fontSize: '45px', fontWeight: 600}}>R$ 89</p>
                <S.PlanDetail>
                    <img src={CheckIcon} alt="check" />
                    <p>5 horas de exercicios por dia</p>
                </S.PlanDetail>
                <S.PlanDetail>
                    <img src={CheckIcon} alt="check" />
                    <p>Taxa de manutenção anual R$ 99,90</p>
                </S.PlanDetail>
                <S.PlanDetail>
                    <img src={CheckIcon} alt="check" />
                    <p>Matrícula R$ 60,00</p>
                </S.PlanDetail>
                <S.Button><Link to='/cadastro'>Matricule-se</Link></S.Button>
            </S.Plan>
            <S.Plan2>
                <img src={coroa} alt='icon'/>
                <p style={{fontSize: '28px'}}>Plano premium</p>
                <p style={{fontSize: '55px', fontWeight: 700}}>R$ 119</p>
                <S.PlanDetail2>
                    <img src={CheckIconWhite} alt="check" />
                    <p>Sem restrição de horários</p>
                </S.PlanDetail2>
                <S.PlanDetail2>
                    <img src={CheckIconWhite} alt="check" />
                    <p>Sem taxa de cancelamento e anuidade</p>
                </S.PlanDetail2>
                <S.PlanDetail2>
                    <img src={CheckIconWhite} alt="check" />
                    <p>Treino em todas as unidades Monster gym</p>
                </S.PlanDetail2>
                <S.Button2><Link to='/cadastro' >Matricule-se</Link></S.Button2>
            </S.Plan2>
            <S.Plan>
                <img src={cardio} alt='icon'/>
                <p style={{fontSize: '28px'}}>Plano pro</p>
                <p style={{fontSize: '45px', fontWeight: 600}}>R$ 179</p>
                <S.PlanDetail>
                    <img src={CheckIcon} alt="check" />
                    <p>Levar 5 amigos por mês</p>
                </S.PlanDetail>
                <S.PlanDetail>
                    <img src={CheckIcon} alt="check" />
                    <p>Cadeira de massagem</p>
                </S.PlanDetail>
                <S.PlanDetail>
                    <img src={CheckIcon} alt="check" />
                    <p>Espaço kids</p>
                </S.PlanDetail>
                <S.Button><Link to='/cadastro'>Matricule-se</Link></S.Button>
            </S.Plan>
        </S.Plans>
    </S.Container>
  )
}
