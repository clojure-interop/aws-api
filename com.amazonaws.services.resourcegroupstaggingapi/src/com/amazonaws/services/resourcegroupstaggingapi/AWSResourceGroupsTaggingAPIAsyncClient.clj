(ns com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIAsyncClient
  "Client for accessing AWS Resource Groups Tagging API asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Resource Groups Tagging API

  This guide describes the API operations for the resource groups tagging.


  A tag is a label that you assign to an AWS resource. A tag consists of a key and a value, both of which you define.
  For example, if you have two Amazon EC2 instances, you might assign both a tag key of \"Stack.\" But the value of
  \"Stack\" might be \"Testing\" for one and \"Production\" for the other.


  Tagging can help you organize your resources and enables you to simplify resource management, access management and
  cost allocation.


  You can use the resource groups tagging API operations to complete the following tasks:




  Tag and untag supported resources located in the specified region for the AWS account




  Use tag-based filters to search for resources located in the specified region for the AWS account




  List all existing tag keys in the specified region for the AWS account




  List all existing values for the specified key in the specified region for the AWS account




  To make full use of the resource groups tagging API operations, you might need additional IAM permissions, including
  permission to access the resources of individual services as well as permission to view and apply tags to those
  resources. For more information, see Obtaining Permissions for Resource Groups and Tag Editor.


  You can use the Resource Groups Tagging API to tag resources for the following AWS services.




  Alexa for Business (a4b)




  API Gateway




  AWS AppStream




  AWS AppSync




  Amazon Athena




  Amazon Aurora




  AWS Certificate Manager




  AWS Certificate Manager Private CA




  Amazon Cloud Directory




  AWS CloudFormation




  Amazon CloudFront




  AWS CloudHSM




  AWS CloudTrail




  Amazon CloudWatch (alarms only)




  Amazon CloudWatch Events




  Amazon CloudWatch Logs




  AWS CodeBuild




  AWS CodeStar




  Amazon Cognito Identity




  Amazon Cognito User Pools




  Amazon Comprehend




  AWS Config




  AWS Data Pipeline




  AWS Database Migration Service




  AWS Datasync




  AWS Direct Connect




  AWS Directory Service




  Amazon DynamoDB




  Amazon EBS




  Amazon EC2




  Amazon ECR




  Amazon ECS




  AWS Elastic Beanstalk




  Amazon Elastic File System




  Elastic Load Balancing




  Amazon ElastiCache




  Amazon Elasticsearch Service




  AWS Elemental MediaLive




  AWS Elemental MediaPackage




  AWS Elemental MediaTailor




  Amazon EMR




  Amazon FSx




  Amazon Glacier




  AWS Glue




  Amazon Inspector




  AWS IoT Analytics




  AWS IoT Core




  AWS IoT Device Defender




  AWS IoT Device Management




  AWS IoT Greengrass




  AWS Key Management Service




  Amazon Kinesis




  Amazon Kinesis Data Analytics




  Amazon Kinesis Data Firehose




  AWS Lambda




  AWS License Manager




  Amazon Machine Learning




  Amazon MQ




  Amazon MSK




  Amazon Neptune




  AWS OpsWorks




  Amazon RDS




  Amazon Redshift




  AWS Resource Access Manager




  AWS Resource Groups




  AWS RoboMaker




  Amazon Route 53




  Amazon Route 53 Resolver




  Amazon S3 (buckets only)




  Amazon SageMaker




  AWS Secrets Manager




  AWS Service Catalog




  Amazon Simple Notification Service (SNS)




  Amazon Simple Queue Service (SQS)




  AWS Simple System Manager (SSM)




  AWS Step Functions




  AWS Storage Gateway




  AWS Transfer for SFTP




  Amazon VPC




  Amazon WorkSpaces"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroupstaggingapi AWSResourceGroupsTaggingAPIAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIAsyncClientBuilder`"
  (^com.amazonaws.services.resourcegroupstaggingapi.AWSResourceGroupsTaggingAPIAsyncClientBuilder []
    (AWSResourceGroupsTaggingAPIAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSResourceGroupsTaggingAPIAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-resources-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest request]
    (-> this (.getResourcesAsync request))))

(defn get-tag-keys-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTagKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest request]
    (-> this (.getTagKeysAsync request))))

(defn get-tag-values-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTagValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagValuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest request]
    (-> this (.getTagValuesAsync request))))

(defn tag-resources-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest request]
    (-> this (.tagResourcesAsync request))))

(defn untag-resources-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsTaggingAPIAsyncClient this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest request]
    (-> this (.untagResourcesAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSResourceGroupsTaggingAPIAsyncClient this]
    (-> this (.shutdown))))

