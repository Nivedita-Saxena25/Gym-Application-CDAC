import styled from 'styled-components'

export const All = styled.div`
    width: 100%;
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    align-items: flex-end;
    justify-content: center;
`

export const SearchArea = styled.div`
    width: 100%;
    margin: 2em auto;
    height: 140px;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-around;
    background: #444;
    position: relative;
    overflow: hidden;
    padding: .5em 1em;
    

    h1{
        font-size: 22px;
        font-weight: 600;
        text-align: center;
        text-shadow:  0 0 10px #ffffff50;
    }

    svg{
        @media screen and (max-width: 640px) {
            display: none;
        }
    }

    div{
        width: 100%;
        max-width: 400px;
    }
`

export const Container = styled.div`
    width: 98%;
    display: flex;
    flex-wrap: wrap;
    align-items: center;
    justify-content: space-around;
    margin: 2em 0;
`

export const Item = styled.div`
    width: 300px;
    height: 500px;
    border-radius: 5px;
    margin: 1.5em 1em;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-between;
    background: #444;
    overflow: hidden;
    padding-bottom: 1em;
    box-shadow: ${props=>props.ina ? '0 0 15px  #ff0022' : ''};
    background: linear-gradient(45deg, ${props=>props.ina ? '#ff0022' : '#444'} 0%, ${props=>props.ina ? '#a30000' : '#444'} 100%);
`

export const ItemImageArea = styled.div`
    width: 100%;
    height: 200px;
    position: relative;
    img{
        width: 100%;
        height: 100%;
        object-fit: cover;
    }
`

export const Aviso = styled.div`
    width: 100%;
    height: 100%;
    background: #a3002260;
    position: absolute;
    align-items: center;
    justify-content: center;
    letter-spacing: 1px;
    font-size: 30px;
    display: ${props=>props.ina ? 'flex' : 'none'};
    font-weight: 700;
    text-shadow: 0 0 10px #ffffff75;
`

export const ItemValor = styled.div`
    display: flex;
    flex-direction: column;
    align-items: center;
    z-index: 2;
    justify-content: center;
    width: 65%;
    height: 65px;
    margin-top: -65px;
    border-radius: 5px;
    background: ${props=>props.ina ? '#eee' : '#ff0022'};
    box-shadow: ${props=>props.ina ? '#ffffff75' : '#ff002275'};
    font-weight: 500;

    p{
        margin: 0;
        color: ${props=>props.ina ? '#ff0022' : '#fff'};
    }
`

export const Valor = styled.p`
    font-size: 22px;
    font-weight: 600;
    text-shadow: 0 0 10px #ffffff50;
`

export const Cidade = styled.p`
    font-size: 22px;
    font-weight: 600;
    text-shadow: 0 0 10px #ffffff50;
    letter-spacing: 1px;
    margin: 0;
`

export const ItemDesc = styled.p`
    opacity: 50%;
    text-shadow: 0 0 10px #ffffff50;
    width: 90%;
    text-align: center;
    margin: 0;
`

export const Button = styled.button`
    width: 90%;
    height: 40px;
    display: flex;
    align-items: center;
    justify-content: center;
    background: ${props=>props.ina ? '#eee' : '#ff0022'};
    box-shadow: ${props=>props.ina ? '#eeeeee75' : '#ff002275'};
    text-shadow:${props=>props.ina ? '#ff002275' : '#0 0 10px #ffffff575'};
    color: ${props=>props.ina ? '#ff0022' : '#eeeeee'};
    font-size: 20px;
    font-weight: 600;
    border: 0;
    border-radius: 5px;
    letter-spacing: 1px;
    transition: all ease-in-out .2s;

    &:hover{
        transform: scale(1.05);
        transition: all ease-in-out .2s;
    }
`
