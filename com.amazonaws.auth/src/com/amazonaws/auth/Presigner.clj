(ns com.amazonaws.auth.Presigner
  "A request signer that has special-case logic to presign requests, generating
  a URL which embeds the signature suitable for hyperlinking."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth Presigner]))

(defn presign-request
  "Signs the request by adding the signature to the URL rather than as a
   header. This method is expected to modify the passed-in request to
   add the signature.

  request - The request to sign. - `com.amazonaws.SignableRequest`
  credentials - The credentials to sign it with. - `com.amazonaws.auth.AWSCredentials`
  expiration - The time when this presigned URL will expire. - `java.util.Date`"
  ([^Presigner this ^com.amazonaws.SignableRequest request ^com.amazonaws.auth.AWSCredentials credentials ^java.util.Date expiration]
    (-> this (.presignRequest request credentials expiration))))

