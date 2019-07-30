(ns com.amazonaws.auth.SignerAsRequestSigner
  "An adapter class that allows a Signer to implement the
  RequestSigner interface"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SignerAsRequestSigner]))

(defn ->signer-as-request-signer
  "Constructor.

  Creates a SignerAsRequestSigner

  signer - the underlying Signer to use to actually sign the request - `com.amazonaws.auth.Signer`
  credentials-provider - the credentialsProvider to use to pass AWSCredentials to the underlying Signer - `com.amazonaws.auth.AWSCredentialsProvider`"
  (^SignerAsRequestSigner [^com.amazonaws.auth.Signer signer ^com.amazonaws.auth.AWSCredentialsProvider credentials-provider]
    (new SignerAsRequestSigner signer credentials-provider)))

(defn sign
  "Description copied from interface: RequestSigner

  request - The request to sign. - `com.amazonaws.SignableRequest`"
  ([^SignerAsRequestSigner this ^com.amazonaws.SignableRequest request]
    (-> this (.sign request))))

