import React from 'react'
import * as S from './style'
import BG from '../../assets/bg_plan.png'
import Plan from '../../components/Plans'
import NavBar from '../../components/Navbar'
import Footer from '../../components/Footer'

export default function index() {

    document.title = 'Monster gym - planos'

  return (
    <S.All>
        <NavBar />
        <S.Container>
            <S.Header>
                <img src={BG} alt='background' />
                <S.HeaderInfo>
                    <h1>Planos</h1>
                    <p>Escolha seu plano e matricule-se online</p>
                </S.HeaderInfo>
            </S.Header>
            <S.Body>
                <Plan />
                <S.InfoAdd>
                    <p>O cancelamento deve ser avisado com no mínimo 30 dias de antecedência do próximo vencimento.
                    O preço da mensalidade não inclui taxas de matrícula e manutenção. Pagamento mensal por cartão de crédito.
                    O preço mínimo pode variar entre os planos e as unidades.
                    </p>
                </S.InfoAdd>

            </S.Body>
        </S.Container>
        <Footer />
    </S.All>
  )
}
