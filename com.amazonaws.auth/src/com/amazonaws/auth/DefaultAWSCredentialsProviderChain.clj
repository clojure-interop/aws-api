(ns com.amazonaws.auth.DefaultAWSCredentialsProviderChain
  "AWS credentials provider chain that looks for credentials in this order:

    Environment Variables -
       AWS_ACCESS_KEY_ID and AWS_SECRET_ACCESS_KEY
       (RECOMMENDED since they are recognized by all the AWS SDKs and CLI except for .NET),
       or AWS_ACCESS_KEY and AWS_SECRET_KEY (only recognized by Java SDK)

    Java System Properties - aws.accessKeyId and aws.secretKey
    Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI
    Credentials delivered through the Amazon EC2 container service if AWS_CONTAINER_CREDENTIALS_RELATIVE_URI\" environment variable is set
    and security manager has permission to access the variable,
    Instance profile credentials delivered through the Amazon EC2 metadata service"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth DefaultAWSCredentialsProviderChain]))

(defn ->default-aws-credentials-provider-chain
  "Constructor."
  (^DefaultAWSCredentialsProviderChain []
    (new DefaultAWSCredentialsProviderChain )))

(defn *get-instance
  "returns: `com.amazonaws.auth.DefaultAWSCredentialsProviderChain`"
  (^com.amazonaws.auth.DefaultAWSCredentialsProviderChain []
    (DefaultAWSCredentialsProviderChain/getInstance )))

