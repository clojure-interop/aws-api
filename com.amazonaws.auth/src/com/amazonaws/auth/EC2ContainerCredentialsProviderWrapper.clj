(ns com.amazonaws.auth.EC2ContainerCredentialsProviderWrapper
  " AWSCredentialsProvider that loads credentials from an Amazon Container (e.g. EC2)

  Credentials are solved in the following order:


          If environment variable \"AWS_CONTAINER_CREDENTIALS_RELATIVE_URI\" is
          set (typically on EC2) it is used to hit the metadata service at the following endpoint: http://169.254.170.2


          If environment variable \"AWS_CONTAINER_CREDENTIALS_FULL_URI\" is
          set it is used to hit a metadata service at that URI.  Optionally an authorization token can be included
          in the \"Authorization\" header of the request by setting the \"AWS_CONTAINER_AUTHORIZATION_TOKEN\" environment variable.


          If neither of the above environment variables are specified credentials are attempted to be loaded from Amazon EC2
          Instance Metadata Service using the InstanceProfileCredentialsProvider."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth EC2ContainerCredentialsProviderWrapper]))

(defn ->ec-2-container-credentials-provider-wrapper
  "Constructor."
  (^EC2ContainerCredentialsProviderWrapper []
    (new EC2ContainerCredentialsProviderWrapper )))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^EC2ContainerCredentialsProviderWrapper this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^EC2ContainerCredentialsProviderWrapper this]
    (-> this (.refresh))))

