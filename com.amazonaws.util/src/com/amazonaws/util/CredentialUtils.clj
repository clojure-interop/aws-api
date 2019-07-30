(ns com.amazonaws.util.CredentialUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util CredentialUtils]))

(defn ->credential-utils
  "Constructor."
  (^CredentialUtils []
    (new CredentialUtils )))

(defn *get-credentials-provider
  "Returns the credentials provider that will be used to fetch the
    credentials when signing the request. Request specific credentials
    takes precedence over the credentials/credentials provider set in the
    client.

  req - `com.amazonaws.AmazonWebServiceRequest`
  base - `com.amazonaws.auth.AWSCredentialsProvider`

  returns: `com.amazonaws.auth.AWSCredentialsProvider`"
  (^com.amazonaws.auth.AWSCredentialsProvider [^com.amazonaws.AmazonWebServiceRequest req ^com.amazonaws.auth.AWSCredentialsProvider base]
    (CredentialUtils/getCredentialsProvider req base)))

