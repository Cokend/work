package app.cddic.com.smarter.service.protocol;

import app.cddic.com.smarter.entity.MsgObject;
import app.cddic.com.smarter.service.PacketMsg;
import app.cddic.com.smarter.service.SmartService;

/**
 * Created by yfs on 4/24 0024.
 */

public class ContactProtocol extends SmartProtocol {
    public ContactProtocol(SmartService Srv) {
        setSrv(Srv);
    }

    public PacketMsg createPkt(MsgObject msg) {

        return null;
    }

    public boolean sendProc(PacketMsg pkt) {
        return true;
    }

    public PacketMsg recvProc(PacketMsg pkt) {
        return null;
    }

    public void timeoutProc(PacketMsg pkt) {

    }
}
