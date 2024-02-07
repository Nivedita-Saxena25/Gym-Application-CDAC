import React from 'react'
import * as S from './style'

export default function index() {
  return (
    <S.Container>
        <h2>Localização</h2>
        <p>A principal academia Monster gym está localizada na Av. Antônio Diederichsen, 389 - Jardim America, Ribeirão Preto.
        Agende uma visita pelo telefone (16) 1234-5678, de segunda a sexta-feira, das 6h às 222 e aos sábados e domingos, das 8h às 15h.</p>
        <S.Iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d29759.62316481575!2d-47.83389866352083!3d-21.194030107372686!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94b9bf5bf9278bbb%3A0xcf5aa0e09446ce72!2sBurger%20King!5e0!3m2!1spt-BR!2sbr!4v1659380985699!5m2!1spt-BR!2sbr" height="400" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></S.Iframe>
    </S.Container>
  )
}
