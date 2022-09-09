import React, {useState} from 'react';

function UserSignupPage() {

    const [displayName, setDisplayName] = useState("")
    const [userName, setUserName] = useState("")
    const [password, setPassword] = useState("")
    const [passwordRepeat, setPasswordRepeat] = useState("")

    function onClick(e){
        e.preventDefault();
    }

    return (
        <div>
            <h1>Sign Up</h1>
            <div>
                <input placeholder="Your display name"
                       value={displayName} onChange={(e)=> setDisplayName(e.target.value)}
                />
            </div>
            <div>
                <input placeholder="Your username"
                       value={userName} onChange={(e)=> setUserName(e.target.value)}
                />
            </div>
            <div>
                <input placeholder="Your password" type="password"
                       value={password} onChange={(e)=> setPassword(e.target.value)}
                />
            </div>
            <div>
                <input placeholder="Repeat your password" type="password"
                       value={passwordRepeat} onChange={(e)=> setPasswordRepeat(e.target.value)}
                />
            </div>
            <button type="submit" onClick={onClick}>Sign Up</button>
        </div>

    );
}

export default UserSignupPage;