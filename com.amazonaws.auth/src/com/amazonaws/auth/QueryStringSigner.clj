(ns com.amazonaws.auth.QueryStringSigner
  "Signer implementation responsible for signing an AWS query string request
  according to the various signature versions and hashing algorithms."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth QueryStringSigner]))

(defn ->query-string-signer
  "Constructor."
  (^QueryStringSigner []
    (new QueryStringSigner )))

(defn sign
  "This signer will add following authentication parameters to the request:

   AWSAccessKeyId SignatureVersion SignatureMethod Timestamp Signature

  request - request to be signed. - `com.amazonaws.SignableRequest`
  version - signature version. \"2\" is recommended. - `com.amazonaws.auth.SignatureVersion`
  algorithm - signature algorithm. \"HmacSHA256\" is recommended. - `com.amazonaws.auth.SigningAlgorithm`
  credentials - `com.amazonaws.auth.AWSCredentials`

  throws: com.amazonaws.SdkClientException"
  ([^QueryStringSigner this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.SignatureVersion version ^com.amazonaws.auth.SigningAlgorithm algorithm ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.sign request version algorithm credentials)))
  ([^QueryStringSigner this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials]
    (-> this (.sign request credentials))))

