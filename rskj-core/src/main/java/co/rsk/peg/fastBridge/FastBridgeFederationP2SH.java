package co.rsk.peg.fastBridge;

import co.rsk.bitcoinj.core.Sha256Hash;

public class FastBridgeFederationP2SH {
    private byte[] fastBridgeFederationP2SH;
    private byte[] federationP2SH;

    public FastBridgeFederationP2SH(byte[] fastBridgeFederationP2SH, byte[] federationP2SH) {
        this.fastBridgeFederationP2SH = fastBridgeFederationP2SH;
        this.federationP2SH = federationP2SH;
    }

    public byte[] getFastBridgeFederationP2SH() {
        return fastBridgeFederationP2SH;
    }

    public byte[] getFederationP2SH() {
        return federationP2SH;
    }
}
