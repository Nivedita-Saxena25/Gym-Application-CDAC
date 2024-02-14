import * as S from './style'
import './style.css'
import PasswordInput from '../../components/PassordInputLogin'
import NavBar from '../../components/Navbar'
import Footer from '../../components/Footer'
import { Link } from 'react-router-dom'

import CakeIcon from '@mui/icons-material/Cake';
import TextField from '@mui/material/TextField';
import Radio from '@mui/material/Radio';
import AccountCircle from '@mui/icons-material/AccountCircle';
import InputAdornment from '@mui/material/InputAdornment';
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import RadioGroup from '@mui/material/RadioGroup';

export default function index() {
    document.title = 'Monster gym - Sign-up'
  return (
    <S.All>
        <NavBar />
        <S.Container>
            <S.ButtonSignin><Link to='/entrar'>Sign in</Link></S.ButtonSignin>
            <S.Signup>
                <h1>Sign up</h1>
                <TextField margin="dense" id="standard-basic" classes={{root: "inputSignup"}} required fullWidth label="Full Name" color="error" variant="outlined"
                    InputProps={{ startAdornment: (
                        <InputAdornment position="start">
                            <AccountCircle />
                        </InputAdornment>
                    )}}
                />
                <TextField classes={{root: "inputSignup"}} id="standard-basic" required margin="dense" fullWidth label="User" color="error" variant="outlined"
                    InputProps={{
                    startAdornment: (
                    <InputAdornment position="start">
                        <AccountCircle className='Svg'/>
                    </InputAdornment>
                    )}}
                />
                <TextField classes={{root: "inputSignup"}} id="outlined-basic" required type='email'  margin="dense" fullWidth label="Email" color="error" variant="outlined"
                    InputProps={{ startAdornment: (
                    <InputAdornment position="start">
                        <AccountCircle />
                    </InputAdornment>
                    )}}
                />
                <S.Inputs row aria-labelledby="demo-row-radio-buttons-group-label"
                    name="row-radio-buttons-group" color="error">
                    <RadioGroup row defaultValue="Male">
                        <FormControlLabel classes={{root: "inputSignup"}} color="error" value="Male" id='radi' control={<Radio/>} label="Male" />
                        <FormControlLabel classes={{root: "inputSignup"}} color="error" value="Female" id='radi' control={<Radio />} label="Female" />
                    </RadioGroup>
                    <TextField margin="dense" classes={{root: "inputSignup"}} id="outlined-basic" required sx={{width: 100}} label="Age" type='number' color="error" variant="outlined"
                    InputProps={{
                    startAdornment: (
                    <InputAdornment position="start">
                        <CakeIcon />
                    </InputAdornment>
                    )}}
                />
                </S.Inputs>
                <PasswordInput />
                <FormControlLabel classes={{root: "inputSignup"}} required id='check' control={<Checkbox defaultChecked />} label={`I have read and accept the terms of use`} />
                <S.ButtonEntrar>Sign up</S.ButtonEntrar>
                <S.SocialArea>
                    <S.Facebook><img alt='facebook icon' src='https://cdn-icons-png.flaticon.com/512/145/145802.png'/>Log in with Facebook</S.Facebook>
                    <S.Twitter><img alt='twitter icon' src='https://cdn-icons-png.flaticon.com/512/145/145812.png'/>Log in with Twitter</S.Twitter>
                </S.SocialArea>
            </S.Signup>
        </S.Container>
        <Footer />
    </S.All>
  )
}
