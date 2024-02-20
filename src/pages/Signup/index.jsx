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
import {
    MDBBtn,
    MDBContainer,
    MDBRow,
    MDBCol,
    MDBIcon,
    MDBInput
  }
  from 'mdb-react-ui-kit';

import "./style.css";

const RegistrationForm = () => {
  return (
    <S.All>
        <NavBar />
        {/* <S.Container style={{background:"transparent"}}> */}
        <MDBContainer fluid >
        <MDBRow>
        <h1 style={{marginLeft:"38%"}}>Registration</h1>
        <hr />
        <MDBCol sm='6'style={{justifyContent:"center"}}>
        
    <form action="#" method="post" className="registration-form">
      
     
      <label for="firstName">First Name:</label>
      <input type="text" id="firstName" name="firstName" required />

      <label for="lastName">Last Name:</label>
      <input type="text" id="lastName" name="lastName" required />

      <label for="middleName">Address:</label>
      <input type="text" id="address" name="address" />

      <label for="dob">Registration date:</label>
      <input type="date" id="dob" name="dob" required />
      </form>
      </MDBCol>
      <MDBCol sm='6'>
      <form action="#" method="post" className="registration-form">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required />

      <label for="mobileNumber">Mobile Number:</label>
      <input
        type="tel"
        id="mobileNumber"
        name="mobileNumber"
        pattern="[0-9]{10}"
        required
      />

      <label for="gender">Gender:</label>
      <select id="gender" name="gender" required>
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="other">Other</option>
      </select>

      <button type="submit">Register</button>
    </form>
    </MDBCol>
    </MDBRow>
    </MDBContainer>
    <Footer />
    </S.All>
  );
};

export default RegistrationForm;



/*export default function index() {
    document.title = 'Monster gym - Cadastro'
  return (
    <S.All>
        <NavBar />
        <S.Container>
            <S.ButtonSignin><Link to='/entrar'>Entrar</Link></S.ButtonSignin>
            <S.Signup>
                <h1>Cadastrar</h1>
                <TextField margin="dense" id="standard-basic" classes={{root: "inputSignup"}} required fullWidth label="Nome Completo" color="error" variant="outlined"
                    InputProps={{ startAdornment: (
                        <InputAdornment position="start">
                            <AccountCircle />
                        </InputAdornment>
                    )}}
                />
                <TextField classes={{root: "inputSignup"}} id="standard-basic" required margin="dense" fullWidth label="Usúario" color="error" variant="outlined"
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
                    <RadioGroup row defaultValue="Masculino">
                        <FormControlLabel classes={{root: "inputSignup"}} color="error" value="Masculino" id='radi' control={<Radio/>} label="Masculino" />
                        <FormControlLabel classes={{root: "inputSignup"}} color="error" value="Feminino" id='radi' control={<Radio />} label="Feminino" />
                    </RadioGroup>
                    <TextField margin="dense" classes={{root: "inputSignup"}} id="outlined-basic" required sx={{width: 100}} label="Idade" type='number' color="error" variant="outlined"
                    InputProps={{
                    startAdornment: (
                    <InputAdornment position="start">
                        <CakeIcon />
                    </InputAdornment>
                    )}}
                />
                </S.Inputs>
                <PasswordInput />
                <FormControlLabel classes={{root: "inputSignup"}} required id='check' control={<Checkbox defaultChecked />} label={`Eu li e aceito os termos de uso`} />
                <S.ButtonEntrar>Cadastrar</S.ButtonEntrar>
                <S.SocialArea>
                    <S.Facebook><img alt='facebook icon' src='https://cdn-icons-png.flaticon.com/512/145/145802.png'/>Cadastar com Facebook</S.Facebook>
                    <S.Twitter><img alt='twitter icon' src='https://cdn-icons-png.flaticon.com/512/145/145812.png'/>Cadastar com Twitter</S.Twitter>
                </S.SocialArea>
            </S.Signup>
        </S.Container>
        <Footer />
    </S.All>
  )
}*/
