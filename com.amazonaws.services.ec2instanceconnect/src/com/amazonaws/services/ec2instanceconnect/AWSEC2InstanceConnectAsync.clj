(ns com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectAsync
  "Interface for accessing EC2 Instance Connect asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSEC2InstanceConnectAsync instead.



  AWS EC2 Connect Service is a service that enables system administrators to publish temporary SSH keys to their EC2
  instances in order to establish connections to their instances without leaving a permanent authentication option."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2instanceconnect AWSEC2InstanceConnectAsync]))

(defn send-ssh-public-key-async
  "Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.

  send-ssh-public-key-request - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AWSEC2InstanceConnectAsync this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest send-ssh-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendSSHPublicKeyAsync send-ssh-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AWSEC2InstanceConnectAsync this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest send-ssh-public-key-request]
    (-> this (.sendSSHPublicKeyAsync send-ssh-public-key-request))))

