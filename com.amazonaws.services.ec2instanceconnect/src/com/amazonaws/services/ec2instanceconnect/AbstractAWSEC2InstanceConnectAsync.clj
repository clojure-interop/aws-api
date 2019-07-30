(ns com.amazonaws.services.ec2instanceconnect.AbstractAWSEC2InstanceConnectAsync
  "Abstract implementation of AWSEC2InstanceConnectAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2instanceconnect AbstractAWSEC2InstanceConnectAsync]))

(defn send-ssh-public-key-async
  "Description copied from interface: AWSEC2InstanceConnectAsync

  request - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSEC2InstanceConnectAsync this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendSSHPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSEC2InstanceConnectAsync this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest request]
    (-> this (.sendSSHPublicKeyAsync request))))

