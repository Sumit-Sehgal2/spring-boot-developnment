"# spring-boot-developnment" 
@PostMapping ("/authenticate")
public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
    try {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getUsername(), authenticationRequest.getPassword()));

    } catch (BadCredentialsException e)
    {
        throw new Exception("Incorrect UserName or Password!",e);
    }

    UserDetails userDetails =
            customUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
    String jwt = jwtUtil.generateToken(userDetails);

    return ResponseEntity.ok(new AuthenticationResponse(jwt));

}
