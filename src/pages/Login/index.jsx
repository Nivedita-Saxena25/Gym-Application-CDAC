import * as S from './style'
import './style.css'
import Image from '../../assets/Mobile login.svg'
import PasswordInput from '../../components/PassordInputLogin'
import { Link } from 'react-router-dom'
import NavBar from '../../components/Navbar'
import Footer from '../../components/Footer'

import TextField from '@mui/material/TextField';
import AccountCircle from '@mui/icons-material/AccountCircle';
import InputAdornment from '@mui/material/InputAdornment';

export default function index() {
    document.title = 'Monster gym - Sign in'
  return (
    <S.All>
        <NavBar />
        <S.Container>
            <img src={Image} alt='img_ilustration'/>
            <S.CountArea>
                    <S.ButtonSignup><Link to='/cadastro'>Sign Up</Link></S.ButtonSignup>
                <S.Login>
                    <h1>Sign in</h1>
                    <TextField classes={{root: "inputEmail"}} id="outlined-basic" required type='email' margin="dense" fullWidth label="Email" color="error" variant="outlined"
                        InputProps={{ startAdornment: (
                        <InputAdornment position="start">
                            <AccountCircle />
                        </InputAdornment>
                        )}}
                    />
                    <PasswordInput />
                    <S.Forgot>Forgot your password?</S.Forgot>
                    <S.ButtonEntrar>Sign in</S.ButtonEntrar>
                    <S.SocialArea>
                        <S.Facebook><img alt='facebook icon' src='https://cdn-icons-png.flaticon.com/512/145/145802.png'/>Log in with Facebook</S.Facebook>
                        <S.Twitter><img alt='twitter icon' src='https://cdn-icons-png.flaticon.com/512/145/145812.png'/>Log in with Twitter</S.Twitter>
                    </S.SocialArea>
                </S.Login>
            </S.CountArea>
        </S.Container>
        <Footer />
    </S.All>
  )
}
