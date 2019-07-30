(ns com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectAsyncClient
  "Client for accessing EC2 Instance Connect asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  AWS EC2 Connect Service is a service that enables system administrators to publish temporary SSH keys to their EC2
  instances in order to establish connections to their instances without leaving a permanent authentication option."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2instanceconnect AWSEC2InstanceConnectAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectAsyncClientBuilder`"
  (^com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectAsyncClientBuilder []
    (AWSEC2InstanceConnectAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSEC2InstanceConnectAsyncClient this]
    (-> this (.getExecutorService))))

(defn send-ssh-public-key-async
  "Description copied from interface: AWSEC2InstanceConnectAsync

  request - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AWSEC2InstanceConnectAsyncClient this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendSSHPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSEC2InstanceConnectAsyncClient this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest request]
    (-> this (.sendSSHPublicKeyAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSEC2InstanceConnectAsyncClient this]
    (-> this (.shutdown))))

