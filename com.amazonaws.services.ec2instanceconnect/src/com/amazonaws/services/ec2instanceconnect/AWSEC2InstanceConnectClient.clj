(ns com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectClient
  "Client for accessing EC2 Instance Connect. All service calls made using this client are blocking, and will not return
  until the service call completes.


  AWS EC2 Connect Service is a service that enables system administrators to publish temporary SSH keys to their EC2
  instances in order to establish connections to their instances without leaving a permanent authentication option."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2instanceconnect AWSEC2InstanceConnectClient]))

(defn *builder
  "returns: `com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectClientBuilder`"
  (^com.amazonaws.services.ec2instanceconnect.AWSEC2InstanceConnectClientBuilder []
    (AWSEC2InstanceConnectClient/builder )))

(defn send-ssh-public-key
  "Pushes an SSH public key to a particular OS user on a given EC2 instance for 60 seconds.

  request - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest`

  returns: Result of the SendSSHPublicKey operation returned by the service. - `com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult`

  throws: com.amazonaws.services.ec2instanceconnect.model.AuthException - Indicates that either your AWS credentials are invalid or you do not have access to the EC2 instance."
  (^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyResult [^AWSEC2InstanceConnectClient this ^com.amazonaws.services.ec2instanceconnect.model.SendSSHPublicKeyRequest request]
    (-> this (.sendSSHPublicKey request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSEC2InstanceConnectClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

