(ns com.amazonaws.services.ec2.AmazonEC2AsyncClient
  "Client for accessing Amazon EC2 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Elastic Compute Cloud

  Amazon Elastic Compute Cloud (Amazon EC2) provides secure and resizable computing capacity in the AWS cloud. Using
  Amazon EC2 eliminates the need to invest in hardware up front, so you can develop and deploy applications faster.


  To learn more, see the following resources:




  Amazon EC2: Amazon EC2 product page, Amazon EC2 documentation




  Amazon EBS: Amazon EBS product page, Amazon EBS documentation




  Amazon VPC: Amazon VPC product page, Amazon VPC documentation




  AWS VPN: AWS VPN product page, AWS VPN documentation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.ec2 AmazonEC2AsyncClient]))

(defn ->amazon-ec-2-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonEC2AsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonEC2AsyncClient aws-credentials client-configuration executor-service))
  (^AmazonEC2AsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonEC2AsyncClient aws-credentials executor-service))
  (^AmazonEC2AsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonEC2AsyncClient client-configuration))
  (^AmazonEC2AsyncClient []
    (new AmazonEC2AsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.ec2.AmazonEC2AsyncClientBuilder`"
  (^com.amazonaws.services.ec2.AmazonEC2AsyncClientBuilder []
    (AmazonEC2AsyncClient/asyncBuilder )))

(defn associate-subnet-cidr-block-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateSubnetCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateSubnetCidrBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateSubnetCidrBlockRequest request]
    (-> this (.associateSubnetCidrBlockAsync request))))

(defn delete-transit-gateway-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGatewayRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteRequest request]
    (-> this (.deleteTransitGatewayRouteAsync request))))

(defn disassociate-iam-instance-profile-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateIamInstanceProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateIamInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateIamInstanceProfileRequest request]
    (-> this (.disassociateIamInstanceProfileAsync request))))

(defn describe-instance-status-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstanceStatusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstanceStatusRequest request]
    (-> this (.describeInstanceStatusAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeInstanceStatusAsync))))

(defn detach-classic-link-vpc-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachClassicLinkVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachClassicLinkVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachClassicLinkVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachClassicLinkVpcRequest request]
    (-> this (.detachClassicLinkVpcAsync request))))

(defn create-traffic-mirror-filter-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRequest request]
    (-> this (.createTrafficMirrorFilterAsync request))))

(defn describe-vpc-peering-connections-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcPeeringConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcPeeringConnectionsRequest request]
    (-> this (.describeVpcPeeringConnectionsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVpcPeeringConnectionsAsync))))

(defn search-transit-gateway-routes-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchTransitGatewayRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchTransitGatewayRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.SearchTransitGatewayRoutesRequest request]
    (-> this (.searchTransitGatewayRoutesAsync request))))

(defn revoke-security-group-ingress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeSecurityGroupIngress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupIngressRequest request]
    (-> this (.revokeSecurityGroupIngressAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.revokeSecurityGroupIngressAsync))))

(defn delete-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteRouteTableRequest request]
    (-> this (.deleteRouteTableAsync request))))

(defn describe-bundle-tasks-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeBundleTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBundleTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeBundleTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeBundleTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBundleTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeBundleTasksRequest request]
    (-> this (.describeBundleTasksAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeBundleTasksAsync))))

(defn replace-transit-gateway-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceTransitGatewayRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceTransitGatewayRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceTransitGatewayRouteRequest request]
    (-> this (.replaceTransitGatewayRouteAsync request))))

(defn describe-key-pairs-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeKeyPairsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeKeyPairs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeKeyPairsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeKeyPairsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeKeyPairsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeKeyPairsRequest request]
    (-> this (.describeKeyPairsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeKeyPairsAsync))))

(defn describe-id-format-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeIdFormatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeIdFormatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdFormatAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeIdFormatRequest request]
    (-> this (.describeIdFormatAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeIdFormatAsync))))

(defn modify-vpc-endpoint-service-permissions-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpointServicePermissions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointServicePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServicePermissionsRequest request]
    (-> this (.modifyVpcEndpointServicePermissionsAsync request))))

(defn modify-vpc-tenancy-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcTenancy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcTenancyResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcTenancyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcTenancyRequest request]
    (-> this (.modifyVpcTenancyAsync request))))

(defn stop-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.StopInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.StopInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.StopInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.StopInstancesRequest request]
    (-> this (.stopInstancesAsync request))))

(defn delete-vpn-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteVpnGateway. - `com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpnGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpnGatewayRequest request]
    (-> this (.deleteVpnGatewayAsync request))))

(defn create-image-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateImageRequest request]
    (-> this (.createImageAsync request))))

(defn modify-fpga-image-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyFpgaImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyFpgaImageAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyFpgaImageAttributeRequest request]
    (-> this (.modifyFpgaImageAttributeAsync request))))

(defn describe-client-vpn-target-networks-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnTargetNetworks operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnTargetNetworksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnTargetNetworksRequest request]
    (-> this (.describeClientVpnTargetNetworksAsync request))))

(defn modify-hosts-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyHostsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyHostsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyHostsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyHostsRequest request]
    (-> this (.modifyHostsAsync request))))

(defn replace-route-table-association-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceRouteTableAssociation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceRouteTableAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceRouteTableAssociationRequest request]
    (-> this (.replaceRouteTableAssociationAsync request))))

(defn describe-traffic-mirror-targets-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrafficMirrorTargets operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrafficMirrorTargetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorTargetsRequest request]
    (-> this (.describeTrafficMirrorTargetsAsync request))))

(defn allocate-hosts-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AllocateHostsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AllocateHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AllocateHostsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateHostsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AllocateHostsRequest request]
    (-> this (.allocateHostsAsync request))))

(defn create-instance-export-task-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateInstanceExportTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceExportTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateInstanceExportTaskRequest request]
    (-> this (.createInstanceExportTaskAsync request))))

(defn get-ebs-encryption-by-default-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEbsEncryptionByDefault operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEbsEncryptionByDefaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetEbsEncryptionByDefaultRequest request]
    (-> this (.getEbsEncryptionByDefaultAsync request))))

(defn describe-vpc-endpoint-services-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeVpcEndpointServices. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicesRequest request]
    (-> this (.describeVpcEndpointServicesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVpcEndpointServicesAsync))))

(defn monitor-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.MonitorInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MonitorInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.MonitorInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.MonitorInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.monitorInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.MonitorInstancesRequest request]
    (-> this (.monitorInstancesAsync request))))

(defn describe-spot-fleet-request-history-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeSpotFleetRequestHistory. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotFleetRequestHistory operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotFleetRequestHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestHistoryRequest request]
    (-> this (.describeSpotFleetRequestHistoryAsync request))))

(defn get-transit-gateway-route-table-associations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTransitGatewayRouteTableAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTransitGatewayRouteTableAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTableAssociationsRequest request]
    (-> this (.getTransitGatewayRouteTableAssociationsAsync request))))

(defn associate-transit-gateway-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTransitGatewayRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateTransitGatewayRouteTableRequest request]
    (-> this (.associateTransitGatewayRouteTableAsync request))))

(defn describe-client-vpn-authorization-rules-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnAuthorizationRules operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnAuthorizationRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnAuthorizationRulesRequest request]
    (-> this (.describeClientVpnAuthorizationRulesAsync request))))

(defn describe-fpga-images-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFpgaImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFpgaImagesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFpgaImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFpgaImagesRequest request]
    (-> this (.describeFpgaImagesAsync request))))

(defn accept-vpc-peering-connection-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptVpcPeeringConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptVpcPeeringConnectionRequest request]
    (-> this (.acceptVpcPeeringConnectionAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.acceptVpcPeeringConnectionAsync))))

(defn describe-elastic-gpus-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeElasticGpusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticGpus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeElasticGpusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeElasticGpusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticGpusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeElasticGpusRequest request]
    (-> this (.describeElasticGpusAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonEC2AsyncClient this]
    (-> this (.getExecutorService))))

(defn enable-transit-gateway-route-table-propagation-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableTransitGatewayRouteTablePropagation operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableTransitGatewayRouteTablePropagationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableTransitGatewayRouteTablePropagationRequest request]
    (-> this (.enableTransitGatewayRouteTablePropagationAsync request))))

(defn describe-spot-price-history-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeSpotPriceHistory. - `com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotPriceHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotPriceHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotPriceHistoryRequest request]
    (-> this (.describeSpotPriceHistoryAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeSpotPriceHistoryAsync))))

(defn import-volume-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ImportVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportVolumeRequest request]
    (-> this (.importVolumeAsync request))))

(defn modify-vpc-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcAttributeRequest request]
    (-> this (.modifyVpcAttributeAsync request))))

(defn describe-network-interface-permissions-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeNetworkInterfacePermissions. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkInterfacePermissions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkInterfacePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacePermissionsRequest request]
    (-> this (.describeNetworkInterfacePermissionsAsync request))))

(defn modify-snapshot-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ModifySnapshotAttribute. - `com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifySnapshotAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySnapshotAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifySnapshotAttributeRequest request]
    (-> this (.modifySnapshotAttributeAsync request))))

(defn modify-instance-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceAttributeRequest request]
    (-> this (.modifyInstanceAttributeAsync request))))

(defn modify-traffic-mirror-session-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTrafficMirrorSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTrafficMirrorSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorSessionRequest request]
    (-> this (.modifyTrafficMirrorSessionAsync request))))

(defn create-vpc-endpoint-connection-notification-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcEndpointConnectionNotification operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcEndpointConnectionNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest request]
    (-> this (.createVpcEndpointConnectionNotificationAsync request))))

(defn describe-scheduled-instance-availability-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeScheduledInstanceAvailability. - `com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledInstanceAvailability operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledInstanceAvailabilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest request]
    (-> this (.describeScheduledInstanceAvailabilityAsync request))))

(defn create-vpn-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateVpnGateway. - `com.amazonaws.services.ec2.model.CreateVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpnGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpnGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpnGatewayRequest request]
    (-> this (.createVpnGatewayAsync request))))

(defn describe-traffic-mirror-sessions-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrafficMirrorSessions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrafficMirrorSessionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorSessionsRequest request]
    (-> this (.describeTrafficMirrorSessionsAsync request))))

(defn describe-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstancesRequest request]
    (-> this (.describeInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeInstancesAsync))))

(defn enable-vpc-classic-link-dns-support-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVpcClassicLinkDnsSupport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVpcClassicLinkDnsSupportAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkDnsSupportRequest request]
    (-> this (.enableVpcClassicLinkDnsSupportAsync request))))

(defn create-vpn-connection-route-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateVpnConnectionRoute. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpnConnectionRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpnConnectionRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpnConnectionRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRouteRequest request]
    (-> this (.createVpnConnectionRouteAsync request))))

(defn enable-vgw-route-propagation-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for EnableVgwRoutePropagation. - `com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVgwRoutePropagation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVgwRoutePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVgwRoutePropagationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVgwRoutePropagationRequest request]
    (-> this (.enableVgwRoutePropagationAsync request))))

(defn describe-vpcs-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcsRequest request]
    (-> this (.describeVpcsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVpcsAsync))))

(defn describe-fleets-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeFleetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFleetsRequest request]
    (-> this (.describeFleetsAsync request))))

(defn describe-instance-credit-specifications-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceCreditSpecifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceCreditSpecificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstanceCreditSpecificationsRequest request]
    (-> this (.describeInstanceCreditSpecificationsAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn withdraw-byoip-cidr-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the WithdrawByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.WithdrawByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.withdrawByoipCidrAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.WithdrawByoipCidrRequest request]
    (-> this (.withdrawByoipCidrAsync request))))

(defn create-launch-template-version-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLaunchTemplateVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLaunchTemplateVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateVersionRequest request]
    (-> this (.createLaunchTemplateVersionAsync request))))

(defn describe-snapshot-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeSnapshotAttribute. - `com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSnapshotAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSnapshotAttributeRequest request]
    (-> this (.describeSnapshotAttributeAsync request))))

(defn start-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.StartInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.StartInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.StartInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.StartInstancesRequest request]
    (-> this (.startInstancesAsync request))))

(defn cancel-import-task-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CancelImportTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelImportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelImportTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelImportTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelImportTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelImportTaskRequest request]
    (-> this (.cancelImportTaskAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.cancelImportTaskAsync))))

(defn get-host-reservation-purchase-preview-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetHostReservationPurchasePreview operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getHostReservationPurchasePreviewAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetHostReservationPurchasePreviewRequest request]
    (-> this (.getHostReservationPurchasePreviewAsync request))))

(defn describe-network-interface-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkInterfaceAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkInterfaceAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfaceAttributeRequest request]
    (-> this (.describeNetworkInterfaceAttributeAsync request))))

(defn modify-vpn-connection-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpnConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpnConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpnConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpnConnectionRequest request]
    (-> this (.modifyVpnConnectionAsync request))))

(defn describe-security-groups-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest request]
    (-> this (.describeSecurityGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeSecurityGroupsAsync))))

(defn describe-transit-gateway-route-tables-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGatewayRouteTables operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewayRouteTablesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayRouteTablesRequest request]
    (-> this (.describeTransitGatewayRouteTablesAsync request))))

(defn attach-network-interface-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for AttachNetworkInterface. - `com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachNetworkInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachNetworkInterfaceRequest request]
    (-> this (.attachNetworkInterfaceAsync request))))

(defn get-console-screenshot-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConsoleScreenshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetConsoleScreenshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConsoleScreenshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetConsoleScreenshotRequest request]
    (-> this (.getConsoleScreenshotAsync request))))

(defn describe-security-group-references-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityGroupReferences operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityGroupReferencesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest request]
    (-> this (.describeSecurityGroupReferencesAsync request))))

(defn detach-network-interface-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DetachNetworkInterface. - `com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachNetworkInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachNetworkInterfaceRequest request]
    (-> this (.detachNetworkInterfaceAsync request))))

(defn enable-vpc-classic-link-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVpcClassicLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVpcClassicLinkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVpcClassicLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVpcClassicLinkRequest request]
    (-> this (.enableVpcClassicLinkAsync request))))

(defn create-vpn-connection-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateVpnConnection. - `com.amazonaws.services.ec2.model.CreateVpnConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpnConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpnConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpnConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpnConnectionRequest request]
    (-> this (.createVpnConnectionAsync request))))

(defn modify-identity-id-format-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyIdentityIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyIdentityIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyIdentityIdFormatAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyIdentityIdFormatRequest request]
    (-> this (.modifyIdentityIdFormatAsync request))))

(defn create-security-group-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateSecurityGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSecurityGroupRequest request]
    (-> this (.createSecurityGroupAsync request))))

(defn describe-scheduled-instances-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeScheduledInstances. - `com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeScheduledInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeScheduledInstancesRequest request]
    (-> this (.describeScheduledInstancesAsync request))))

(defn export-client-vpn-client-configuration-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportClientVpnClientConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportClientVpnClientConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ExportClientVpnClientConfigurationRequest request]
    (-> this (.exportClientVpnClientConfigurationAsync request))))

(defn authorize-client-vpn-ingress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeClientVpnIngress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeClientVpnIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AuthorizeClientVpnIngressRequest request]
    (-> this (.authorizeClientVpnIngressAsync request))))

(defn cancel-bundle-task-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CancelBundleTask. - `com.amazonaws.services.ec2.model.CancelBundleTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelBundleTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelBundleTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelBundleTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelBundleTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelBundleTaskRequest request]
    (-> this (.cancelBundleTaskAsync request))))

(defn describe-vpn-connections-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeVpnConnections. - `com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpnConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpnConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpnConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpnConnectionsRequest request]
    (-> this (.describeVpnConnectionsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVpnConnectionsAsync))))

(defn replace-network-acl-entry-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceNetworkAclEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceNetworkAclEntryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclEntryRequest request]
    (-> this (.replaceNetworkAclEntryAsync request))))

(defn describe-launch-templates-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLaunchTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeLaunchTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLaunchTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplatesRequest request]
    (-> this (.describeLaunchTemplatesAsync request))))

(defn create-key-pair-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateKeyPairRequest request]
    (-> this (.createKeyPairAsync request))))

(defn delete-internet-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInternetGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteInternetGatewayRequest request]
    (-> this (.deleteInternetGatewayAsync request))))

(defn delete-traffic-mirror-session-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorSessionRequest request]
    (-> this (.deleteTrafficMirrorSessionAsync request))))

(defn create-snapshots-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSnapshotsRequest request]
    (-> this (.createSnapshotsAsync request))))

(defn create-placement-group-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreatePlacementGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlacementGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreatePlacementGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreatePlacementGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlacementGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreatePlacementGroupRequest request]
    (-> this (.createPlacementGroupAsync request))))

(defn describe-images-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImagesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImagesRequest request]
    (-> this (.describeImagesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeImagesAsync))))

(defn reboot-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RebootInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RebootInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RebootInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RebootInstancesRequest request]
    (-> this (.rebootInstancesAsync request))))

(defn modify-id-format-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyIdFormatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyIdFormatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyIdFormatAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyIdFormatRequest request]
    (-> this (.modifyIdFormatAsync request))))

(defn cancel-export-task-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CancelExportTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelExportTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelExportTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelExportTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelExportTaskRequest request]
    (-> this (.cancelExportTaskAsync request))))

(defn associate-address-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateAddressRequest request]
    (-> this (.associateAddressAsync request))))

(defn delete-volume-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteVolume. - `com.amazonaws.services.ec2.model.DeleteVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVolumeRequest request]
    (-> this (.deleteVolumeAsync request))))

(defn purchase-reserved-instances-offering-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for PurchaseReservedInstancesOffering. - `com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedInstancesOffering operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedInstancesOfferingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.PurchaseReservedInstancesOfferingRequest request]
    (-> this (.purchaseReservedInstancesOfferingAsync request))))

(defn reset-ebs-default-kms-key-id-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetEbsDefaultKmsKeyId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetEbsDefaultKmsKeyIdAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetEbsDefaultKmsKeyIdRequest request]
    (-> this (.resetEbsDefaultKmsKeyIdAsync request))))

(defn modify-traffic-mirror-filter-rule-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTrafficMirrorFilterRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTrafficMirrorFilterRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterRuleRequest request]
    (-> this (.modifyTrafficMirrorFilterRuleAsync request))))

(defn create-transit-gateway-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteTableRequest request]
    (-> this (.createTransitGatewayRouteTableAsync request))))

(defn modify-instance-capacity-reservation-attributes-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceCapacityReservationAttributes operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceCapacityReservationAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceCapacityReservationAttributesRequest request]
    (-> this (.modifyInstanceCapacityReservationAttributesAsync request))))

(defn export-transit-gateway-routes-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportTransitGatewayRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportTransitGatewayRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ExportTransitGatewayRoutesRequest request]
    (-> this (.exportTransitGatewayRoutesAsync request))))

(defn disassociate-subnet-cidr-block-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateSubnetCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateSubnetCidrBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateSubnetCidrBlockRequest request]
    (-> this (.disassociateSubnetCidrBlockAsync request))))

(defn delete-fpga-image-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteFpgaImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFpgaImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteFpgaImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteFpgaImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFpgaImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteFpgaImageRequest request]
    (-> this (.deleteFpgaImageAsync request))))

(defn delete-vpn-connection-route-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteVpnConnectionRoute. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpnConnectionRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpnConnectionRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRouteRequest request]
    (-> this (.deleteVpnConnectionRouteAsync request))))

(defn delete-traffic-mirror-target-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorTargetRequest request]
    (-> this (.deleteTrafficMirrorTargetAsync request))))

(defn delete-client-vpn-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClientVpnRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteClientVpnRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClientVpnRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteClientVpnRouteRequest request]
    (-> this (.deleteClientVpnRouteAsync request))))

(defn delete-launch-template-versions-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLaunchTemplateVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLaunchTemplateVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateVersionsRequest request]
    (-> this (.deleteLaunchTemplateVersionsAsync request))))

(defn reset-fpga-image-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetFpgaImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetFpgaImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetFpgaImageAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetFpgaImageAttributeRequest request]
    (-> this (.resetFpgaImageAttributeAsync request))))

(defn describe-spot-fleet-requests-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeSpotFleetRequests. - `com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotFleetRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotFleetRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotFleetRequestsRequest request]
    (-> this (.describeSpotFleetRequestsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeSpotFleetRequestsAsync))))

(defn describe-vpc-endpoint-service-permissions-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointServicePermissions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointServicePermissionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServicePermissionsRequest request]
    (-> this (.describeVpcEndpointServicePermissionsAsync request))))

(defn import-snapshot-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ImportSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportSnapshotRequest request]
    (-> this (.importSnapshotAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.importSnapshotAsync))))

(defn create-fpga-image-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateFpgaImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFpgaImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateFpgaImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateFpgaImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFpgaImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateFpgaImageRequest request]
    (-> this (.createFpgaImageAsync request))))

(defn describe-transit-gateway-attachments-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGatewayAttachments operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewayAttachmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayAttachmentsRequest request]
    (-> this (.describeTransitGatewayAttachmentsAsync request))))

(defn delete-placement-group-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeletePlacementGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlacementGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeletePlacementGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeletePlacementGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlacementGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeletePlacementGroupRequest request]
    (-> this (.deletePlacementGroupAsync request))))

(defn describe-spot-instance-requests-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeSpotInstanceRequests. - `com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotInstanceRequests operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotInstanceRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest request]
    (-> this (.describeSpotInstanceRequestsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeSpotInstanceRequestsAsync))))

(defn create-vpc-endpoint-service-configuration-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcEndpointServiceConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcEndpointServiceConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest request]
    (-> this (.createVpcEndpointServiceConfigurationAsync request))))

(defn detach-vpn-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DetachVpnGateway. - `com.amazonaws.services.ec2.model.DetachVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachVpnGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachVpnGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachVpnGatewayRequest request]
    (-> this (.detachVpnGatewayAsync request))))

(defn create-spot-datafeed-subscription-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSpotDatafeedSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSpotDatafeedSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSpotDatafeedSubscriptionRequest request]
    (-> this (.createSpotDatafeedSubscriptionAsync request))))

(defn create-snapshot-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateSnapshot. - `com.amazonaws.services.ec2.model.CreateSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSnapshotRequest request]
    (-> this (.createSnapshotAsync request))))

(defn revoke-security-group-egress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeSecurityGroupEgress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeSecurityGroupEgressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RevokeSecurityGroupEgressRequest request]
    (-> this (.revokeSecurityGroupEgressAsync request))))

(defn delete-customer-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteCustomerGateway. - `com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomerGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteCustomerGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomerGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteCustomerGatewayRequest request]
    (-> this (.deleteCustomerGatewayAsync request))))

(defn delete-subnet-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteSubnetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSubnet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSubnetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSubnetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSubnetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSubnetRequest request]
    (-> this (.deleteSubnetAsync request))))

(defn delete-network-acl-entry-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkAclEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkAclEntryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkAclEntryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkAclEntryRequest request]
    (-> this (.deleteNetworkAclEntryAsync request))))

(defn describe-volumes-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVolumesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumesRequest request]
    (-> this (.describeVolumesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVolumesAsync))))

(defn release-hosts-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReleaseHostsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReleaseHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReleaseHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReleaseHostsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.releaseHostsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReleaseHostsRequest request]
    (-> this (.releaseHostsAsync request))))

(defn modify-volume-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVolumeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVolumeRequest request]
    (-> this (.modifyVolumeAsync request))))

(defn confirm-product-instance-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ConfirmProductInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ConfirmProductInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmProductInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ConfirmProductInstanceRequest request]
    (-> this (.confirmProductInstanceAsync request))))

(defn terminate-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.TerminateInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.TerminateInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.TerminateInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.TerminateInstancesRequest request]
    (-> this (.terminateInstancesAsync request))))

(defn modify-spot-fleet-request-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ModifySpotFleetRequest. - `com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySpotFleetRequest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifySpotFleetRequestResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySpotFleetRequestAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifySpotFleetRequestRequest request]
    (-> this (.modifySpotFleetRequestAsync request))))

(defn get-ebs-default-kms-key-id-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEbsDefaultKmsKeyId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEbsDefaultKmsKeyIdAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetEbsDefaultKmsKeyIdRequest request]
    (-> this (.getEbsDefaultKmsKeyIdAsync request))))

(defn create-traffic-mirror-filter-rule-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorFilterRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorFilterRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorFilterRuleRequest request]
    (-> this (.createTrafficMirrorFilterRuleAsync request))))

(defn reset-image-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ResetImageAttribute. - `com.amazonaws.services.ec2.model.ResetImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetImageAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetImageAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetImageAttributeRequest request]
    (-> this (.resetImageAttributeAsync request))))

(defn delete-launch-template-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLaunchTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteLaunchTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLaunchTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteLaunchTemplateRequest request]
    (-> this (.deleteLaunchTemplateAsync request))))

(defn describe-dhcp-options-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDhcpOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeDhcpOptionsRequest request]
    (-> this (.describeDhcpOptionsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeDhcpOptionsAsync))))

(defn restore-address-to-classic-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreAddressToClassic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RestoreAddressToClassicResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreAddressToClassicAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RestoreAddressToClassicRequest request]
    (-> this (.restoreAddressToClassicAsync request))))

(defn delete-vpc-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcRequest request]
    (-> this (.deleteVpcAsync request))))

(defn modify-subnet-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifySubnetAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifySubnetAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifySubnetAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifySubnetAttributeRequest request]
    (-> this (.modifySubnetAttributeAsync request))))

(defn run-scheduled-instances-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for RunScheduledInstances. - `com.amazonaws.services.ec2.model.RunScheduledInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunScheduledInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RunScheduledInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RunScheduledInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runScheduledInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RunScheduledInstancesRequest request]
    (-> this (.runScheduledInstancesAsync request))))

(defn update-security-group-rule-descriptions-ingress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsIngress operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecurityGroupRuleDescriptionsIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest request]
    (-> this (.updateSecurityGroupRuleDescriptionsIngressAsync request))))

(defn bundle-instance-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for BundleInstance. - `com.amazonaws.services.ec2.model.BundleInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BundleInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.BundleInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.BundleInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.bundleInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.BundleInstanceRequest request]
    (-> this (.bundleInstanceAsync request))))

(defn modify-ebs-default-kms-key-id-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEbsDefaultKmsKeyId operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEbsDefaultKmsKeyIdAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyEbsDefaultKmsKeyIdRequest request]
    (-> this (.modifyEbsDefaultKmsKeyIdAsync request))))

(defn delete-network-interface-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteNetworkInterface. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfaceRequest request]
    (-> this (.deleteNetworkInterfaceAsync request))))

(defn accept-transit-gateway-vpc-attachment-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptTransitGatewayVpcAttachmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptTransitGatewayVpcAttachmentRequest request]
    (-> this (.acceptTransitGatewayVpcAttachmentAsync request))))

(defn delete-vpn-connection-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteVpnConnection. - `com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpnConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpnConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpnConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpnConnectionRequest request]
    (-> this (.deleteVpnConnectionAsync request))))

(defn cancel-conversion-task-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CancelConversionTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelConversionTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelConversionTaskResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelConversionTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelConversionTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelConversionTaskRequest request]
    (-> this (.cancelConversionTaskAsync request))))

(defn describe-reserved-instances-listings-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeReservedInstancesListings. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstancesListings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesListingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesListingsRequest request]
    (-> this (.describeReservedInstancesListingsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeReservedInstancesListingsAsync))))

(defn create-network-acl-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateNetworkAclRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkAcl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkAclResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkAclRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkAclAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkAclRequest request]
    (-> this (.createNetworkAclAsync request))))

(defn describe-principal-id-format-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePrincipalIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePrincipalIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePrincipalIdFormatAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePrincipalIdFormatRequest request]
    (-> this (.describePrincipalIdFormatAsync request))))

(defn terminate-client-vpn-connections-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateClientVpnConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateClientVpnConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.TerminateClientVpnConnectionsRequest request]
    (-> this (.terminateClientVpnConnectionsAsync request))))

(defn allocate-address-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AllocateAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AllocateAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AllocateAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AllocateAddressRequest request]
    (-> this (.allocateAddressAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.allocateAddressAsync))))

(defn delete-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteRouteRequest request]
    (-> this (.deleteRouteAsync request))))

(defn describe-export-tasks-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeExportTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeExportTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeExportTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasksAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeExportTasksAsync))))

(defn describe-vpc-endpoints-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeVpcEndpoints. - `com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointsRequest request]
    (-> this (.describeVpcEndpointsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVpcEndpointsAsync))))

(defn detach-volume-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DetachVolume. - `com.amazonaws.services.ec2.model.DetachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachVolumeRequest request]
    (-> this (.detachVolumeAsync request))))

(defn authorize-security-group-ingress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeSecurityGroupIngress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeSecurityGroupIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest request]
    (-> this (.authorizeSecurityGroupIngressAsync request))))

(defn disable-vpc-classic-link-dns-support-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableVpcClassicLinkDnsSupport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableVpcClassicLinkDnsSupportAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest request]
    (-> this (.disableVpcClassicLinkDnsSupportAsync request))))

(defn attach-classic-link-vpc-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachClassicLinkVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachClassicLinkVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachClassicLinkVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachClassicLinkVpcRequest request]
    (-> this (.attachClassicLinkVpcAsync request))))

(defn describe-aggregate-id-format-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAggregateIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAggregateIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAggregateIdFormatAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAggregateIdFormatRequest request]
    (-> this (.describeAggregateIdFormatAsync request))))

(defn describe-network-acls-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkAcls operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkAclsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkAclsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkAclsRequest request]
    (-> this (.describeNetworkAclsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeNetworkAclsAsync))))

(defn describe-spot-fleet-instances-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeSpotFleetInstances. - `com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotFleetInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotFleetInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotFleetInstancesRequest request]
    (-> this (.describeSpotFleetInstancesAsync request))))

(defn delete-vpc-endpoint-connection-notifications-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcEndpointConnectionNotifications operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcEndpointConnectionNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointConnectionNotificationsRequest request]
    (-> this (.deleteVpcEndpointConnectionNotificationsAsync request))))

(defn describe-reserved-instances-modifications-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeReservedInstancesModifications. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstancesModifications operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesModificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesModificationsRequest request]
    (-> this (.describeReservedInstancesModificationsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeReservedInstancesModificationsAsync))))

(defn describe-traffic-mirror-filters-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrafficMirrorFilters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrafficMirrorFiltersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTrafficMirrorFiltersRequest request]
    (-> this (.describeTrafficMirrorFiltersAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonEC2AsyncClient this]
    (-> this (.shutdown))))

(defn run-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RunInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RunInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RunInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RunInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.runInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RunInstancesRequest request]
    (-> this (.runInstancesAsync request))))

(defn delete-dhcp-options-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDhcpOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteDhcpOptionsRequest request]
    (-> this (.deleteDhcpOptionsAsync request))))

(defn delete-vpc-endpoints-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteVpcEndpoints. - `com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointsRequest request]
    (-> this (.deleteVpcEndpointsAsync request))))

(defn create-vpc-endpoint-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateVpcEndpoint. - `com.amazonaws.services.ec2.model.CreateVpcEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcEndpointRequest request]
    (-> this (.createVpcEndpointAsync request))))

(defn modify-instance-placement-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstancePlacement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstancePlacementResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstancePlacementAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstancePlacementRequest request]
    (-> this (.modifyInstancePlacementAsync request))))

(defn describe-addresses-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeAddressesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAddressesRequest request]
    (-> this (.describeAddressesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeAddressesAsync))))

(defn describe-vpn-gateways-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeVpnGateways. - `com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpnGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpnGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpnGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpnGatewaysRequest request]
    (-> this (.describeVpnGatewaysAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVpnGatewaysAsync))))

(defn describe-byoip-cidrs-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeByoipCidrs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeByoipCidrsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeByoipCidrsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeByoipCidrsRequest request]
    (-> this (.describeByoipCidrsAsync request))))

(defn reject-vpc-peering-connection-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectVpcPeeringConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RejectVpcPeeringConnectionRequest request]
    (-> this (.rejectVpcPeeringConnectionAsync request))))

(defn revoke-client-vpn-ingress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeClientVpnIngress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RevokeClientVpnIngressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeClientVpnIngressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RevokeClientVpnIngressRequest request]
    (-> this (.revokeClientVpnIngressAsync request))))

(defn assign-private-ip-addresses-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for AssignPrivateIpAddresses. - `com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignPrivateIpAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssignPrivateIpAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignPrivateIpAddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssignPrivateIpAddressesRequest request]
    (-> this (.assignPrivateIpAddressesAsync request))))

(defn reset-instance-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetInstanceAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetInstanceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetInstanceAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetInstanceAttributeRequest request]
    (-> this (.resetInstanceAttributeAsync request))))

(defn replace-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReplaceRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceRouteRequest request]
    (-> this (.replaceRouteAsync request))))

(defn create-fleet-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateFleetRequest request]
    (-> this (.createFleetAsync request))))

(defn associate-client-vpn-target-network-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateClientVpnTargetNetwork operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateClientVpnTargetNetworkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateClientVpnTargetNetworkRequest request]
    (-> this (.associateClientVpnTargetNetworkAsync request))))

(defn delete-network-interface-permission-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteNetworkInterfacePermission. - `com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkInterfacePermission operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkInterfacePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkInterfacePermissionRequest request]
    (-> this (.deleteNetworkInterfacePermissionAsync request))))

(defn create-vpc-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcRequest request]
    (-> this (.createVpcAsync request))))

(defn get-launch-template-data-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLaunchTemplateData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetLaunchTemplateDataResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLaunchTemplateDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetLaunchTemplateDataRequest request]
    (-> this (.getLaunchTemplateDataAsync request))))

(defn attach-internet-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AttachInternetGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachInternetGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachInternetGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachInternetGatewayRequest request]
    (-> this (.attachInternetGatewayAsync request))))

(defn reset-snapshot-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ResetSnapshotAttribute. - `com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetSnapshotAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetSnapshotAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetSnapshotAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetSnapshotAttributeRequest request]
    (-> this (.resetSnapshotAttributeAsync request))))

(defn describe-nat-gateways-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNatGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNatGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNatGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNatGatewaysRequest request]
    (-> this (.describeNatGatewaysAsync request))))

(defn copy-image-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CopyImage. - `com.amazonaws.services.ec2.model.CopyImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CopyImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CopyImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CopyImageRequest request]
    (-> this (.copyImageAsync request))))

(defn create-default-subnet-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDefaultSubnet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateDefaultSubnetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDefaultSubnetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateDefaultSubnetRequest request]
    (-> this (.createDefaultSubnetAsync request))))

(defn delete-flow-logs-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteFlowLogsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFlowLogs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteFlowLogsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteFlowLogsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFlowLogsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteFlowLogsRequest request]
    (-> this (.deleteFlowLogsAsync request))))

(defn accept-vpc-endpoint-connections-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptVpcEndpointConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptVpcEndpointConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptVpcEndpointConnectionsRequest request]
    (-> this (.acceptVpcEndpointConnectionsAsync request))))

(defn enable-ebs-encryption-by-default-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableEbsEncryptionByDefault operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableEbsEncryptionByDefaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableEbsEncryptionByDefaultRequest request]
    (-> this (.enableEbsEncryptionByDefaultAsync request))))

(defn create-network-interface-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateNetworkInterface. - `com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkInterface operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkInterfaceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkInterfaceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkInterfaceRequest request]
    (-> this (.createNetworkInterfaceAsync request))))

(defn modify-network-interface-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ModifyNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyNetworkInterfaceAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyNetworkInterfaceAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyNetworkInterfaceAttributeRequest request]
    (-> this (.modifyNetworkInterfaceAttributeAsync request))))

(defn describe-identity-id-format-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityIdFormat operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeIdentityIdFormatResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityIdFormatAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeIdentityIdFormatRequest request]
    (-> this (.describeIdentityIdFormatAsync request))))

(defn describe-capacity-reservations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCapacityReservations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeCapacityReservationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCapacityReservationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeCapacityReservationsRequest request]
    (-> this (.describeCapacityReservationsAsync request))))

(defn create-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateRouteTableRequest request]
    (-> this (.createRouteTableAsync request))))

(defn associate-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateRouteTableRequest request]
    (-> this (.associateRouteTableAsync request))))

(defn modify-launch-template-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLaunchTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyLaunchTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLaunchTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyLaunchTemplateRequest request]
    (-> this (.modifyLaunchTemplateAsync request))))

(defn create-traffic-mirror-session-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorSession operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorSessionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorSessionRequest request]
    (-> this (.createTrafficMirrorSessionAsync request))))

(defn describe-client-vpn-routes-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnRoutes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnRoutesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnRoutesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnRoutesRequest request]
    (-> this (.describeClientVpnRoutesAsync request))))

(defn cancel-spot-instance-requests-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CancelSpotInstanceRequests. - `com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSpotInstanceRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSpotInstanceRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest request]
    (-> this (.cancelSpotInstanceRequestsAsync request))))

(defn modify-image-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ModifyImageAttribute. - `com.amazonaws.services.ec2.model.ModifyImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyImageAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyImageAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyImageAttributeRequest request]
    (-> this (.modifyImageAttributeAsync request))))

(defn create-dhcp-options-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDhcpOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateDhcpOptionsRequest request]
    (-> this (.createDhcpOptionsAsync request))))

(defn create-transit-gateway-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGatewayRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRouteRequest request]
    (-> this (.createTransitGatewayRouteAsync request))))

(defn describe-classic-link-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClassicLinkInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClassicLinkInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClassicLinkInstancesRequest request]
    (-> this (.describeClassicLinkInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeClassicLinkInstancesAsync))))

(defn delete-spot-datafeed-subscription-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSpotDatafeedSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSpotDatafeedSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSpotDatafeedSubscriptionRequest request]
    (-> this (.deleteSpotDatafeedSubscriptionAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.deleteSpotDatafeedSubscriptionAsync))))

(defn delete-transit-gateway-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRouteTableRequest request]
    (-> this (.deleteTransitGatewayRouteTableAsync request))))

(defn describe-iam-instance-profile-associations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIamInstanceProfileAssociations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIamInstanceProfileAssociationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest request]
    (-> this (.describeIamInstanceProfileAssociationsAsync request))))

(defn get-console-output-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetConsoleOutputRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConsoleOutput operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetConsoleOutputResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetConsoleOutputRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConsoleOutputAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetConsoleOutputRequest request]
    (-> this (.getConsoleOutputAsync request))))

(defn replace-network-acl-association-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceNetworkAclAssociation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceNetworkAclAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceNetworkAclAssociationRequest request]
    (-> this (.replaceNetworkAclAssociationAsync request))))

(defn describe-transit-gateways-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewaysRequest request]
    (-> this (.describeTransitGatewaysAsync request))))

(defn describe-client-vpn-endpoints-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnEndpointsRequest request]
    (-> this (.describeClientVpnEndpointsAsync request))))

(defn describe-fleet-history-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFleetHistoryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetHistoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFleetHistoryRequest request]
    (-> this (.describeFleetHistoryAsync request))))

(defn create-traffic-mirror-target-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrafficMirrorTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrafficMirrorTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTrafficMirrorTargetRequest request]
    (-> this (.createTrafficMirrorTargetAsync request))))

(defn create-internet-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateInternetGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateInternetGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInternetGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateInternetGatewayRequest request]
    (-> this (.createInternetGatewayAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.createInternetGatewayAsync))))

(defn create-subnet-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateSubnetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSubnet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateSubnetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSubnetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSubnetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateSubnetRequest request]
    (-> this (.createSubnetAsync request))))

(defn reject-vpc-endpoint-connections-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectVpcEndpointConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectVpcEndpointConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RejectVpcEndpointConnectionsRequest request]
    (-> this (.rejectVpcEndpointConnectionsAsync request))))

(defn unassign-private-ip-addresses-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for UnassignPrivateIpAddresses. - `com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignPrivateIpAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignPrivateIpAddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UnassignPrivateIpAddressesRequest request]
    (-> this (.unassignPrivateIpAddressesAsync request))))

(defn describe-volumes-modifications-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumesModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumesModificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumesModificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumesModificationsRequest request]
    (-> this (.describeVolumesModificationsAsync request))))

(defn describe-snapshots-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSnapshotsRequest request]
    (-> this (.describeSnapshotsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeSnapshotsAsync))))

(defn create-tags-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn describe-volume-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeVolumeAttribute. - `com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumeAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumeAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumeAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumeAttributeRequest request]
    (-> this (.describeVolumeAttributeAsync request))))

(defn describe-reserved-instances-offerings-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeReservedInstancesOfferings. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstancesOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesOfferingsRequest request]
    (-> this (.describeReservedInstancesOfferingsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeReservedInstancesOfferingsAsync))))

(defn apply-security-groups-to-client-vpn-target-network-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplySecurityGroupsToClientVpnTargetNetwork operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applySecurityGroupsToClientVpnTargetNetworkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ApplySecurityGroupsToClientVpnTargetNetworkRequest request]
    (-> this (.applySecurityGroupsToClientVpnTargetNetworkAsync request))))

(defn create-network-interface-permission-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateNetworkInterfacePermission. - `com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkInterfacePermission operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkInterfacePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkInterfacePermissionRequest request]
    (-> this (.createNetworkInterfacePermissionAsync request))))

(defn get-transit-gateway-route-table-propagations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTransitGatewayRouteTablePropagations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTransitGatewayRouteTablePropagationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetTransitGatewayRouteTablePropagationsRequest request]
    (-> this (.getTransitGatewayRouteTablePropagationsAsync request))))

(defn import-instance-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ImportInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportInstanceRequest request]
    (-> this (.importInstanceAsync request))))

(defn describe-host-reservations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeHostReservationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHostReservations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeHostReservationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeHostReservationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostReservationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeHostReservationsRequest request]
    (-> this (.describeHostReservationsAsync request))))

(defn deprovision-byoip-cidr-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprovisionByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeprovisionByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprovisionByoipCidrAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeprovisionByoipCidrRequest request]
    (-> this (.deprovisionByoipCidrAsync request))))

(defn purchase-scheduled-instances-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for PurchaseScheduledInstances. - `com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseScheduledInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.PurchaseScheduledInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseScheduledInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.PurchaseScheduledInstancesRequest request]
    (-> this (.purchaseScheduledInstancesAsync request))))

(defn describe-vpc-endpoint-connection-notifications-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointConnectionNotifications operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointConnectionNotificationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionNotificationsRequest request]
    (-> this (.describeVpcEndpointConnectionNotificationsAsync request))))

(defn describe-internet-gateways-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInternetGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInternetGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInternetGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInternetGatewaysRequest request]
    (-> this (.describeInternetGatewaysAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeInternetGatewaysAsync))))

(defn modify-fleet-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyFleetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyFleetRequest request]
    (-> this (.modifyFleetAsync request))))

(defn delete-egress-only-internet-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEgressOnlyInternetGateway operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEgressOnlyInternetGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest request]
    (-> this (.deleteEgressOnlyInternetGatewayAsync request))))

(defn release-address-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReleaseAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReleaseAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReleaseAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReleaseAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.releaseAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReleaseAddressRequest request]
    (-> this (.releaseAddressAsync request))))

(defn describe-image-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeImageAttribute. - `com.amazonaws.services.ec2.model.DescribeImageAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImageAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImageAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImageAttributeRequest request]
    (-> this (.describeImageAttributeAsync request))))

(defn modify-traffic-mirror-filter-network-services-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTrafficMirrorFilterNetworkServices operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTrafficMirrorFilterNetworkServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTrafficMirrorFilterNetworkServicesRequest request]
    (-> this (.modifyTrafficMirrorFilterNetworkServicesAsync request))))

(defn delete-traffic-mirror-filter-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRequest request]
    (-> this (.deleteTrafficMirrorFilterAsync request))))

(defn move-address-to-vpc-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.MoveAddressToVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MoveAddressToVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.MoveAddressToVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.MoveAddressToVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.moveAddressToVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.MoveAddressToVpcRequest request]
    (-> this (.moveAddressToVpcAsync request))))

(defn describe-import-image-tasks-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImportImageTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImportImageTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImportImageTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImportImageTasksRequest request]
    (-> this (.describeImportImageTasksAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeImportImageTasksAsync))))

(defn describe-network-interfaces-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeNetworkInterfaces. - `com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNetworkInterfaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeNetworkInterfacesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNetworkInterfacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeNetworkInterfacesRequest request]
    (-> this (.describeNetworkInterfacesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeNetworkInterfacesAsync))))

(defn modify-instance-event-start-time-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceEventStartTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceEventStartTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceEventStartTimeRequest request]
    (-> this (.modifyInstanceEventStartTimeAsync request))))

(defn cancel-spot-fleet-requests-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CancelSpotFleetRequests. - `com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSpotFleetRequests operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelSpotFleetRequestsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSpotFleetRequestsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelSpotFleetRequestsRequest request]
    (-> this (.cancelSpotFleetRequestsAsync request))))

(defn disassociate-transit-gateway-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateTransitGatewayRouteTable operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateTransitGatewayRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateTransitGatewayRouteTableRequest request]
    (-> this (.disassociateTransitGatewayRouteTableAsync request))))

(defn create-transit-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayRequest request]
    (-> this (.createTransitGatewayAsync request))))

(defn create-capacity-reservation-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateCapacityReservationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCapacityReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateCapacityReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateCapacityReservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCapacityReservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateCapacityReservationRequest request]
    (-> this (.createCapacityReservationAsync request))))

(defn get-capacity-reservation-usage-async
  "request - `com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCapacityReservationUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetCapacityReservationUsageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCapacityReservationUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetCapacityReservationUsageRequest request]
    (-> this (.getCapacityReservationUsageAsync request))))

(defn describe-conversion-tasks-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeConversionTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConversionTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeConversionTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeConversionTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConversionTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeConversionTasksRequest request]
    (-> this (.describeConversionTasksAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeConversionTasksAsync))))

(defn request-spot-instances-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for RequestSpotInstances. - `com.amazonaws.services.ec2.model.RequestSpotInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestSpotInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RequestSpotInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RequestSpotInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestSpotInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RequestSpotInstancesRequest request]
    (-> this (.requestSpotInstancesAsync request))))

(defn delete-client-vpn-endpoint-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteClientVpnEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteClientVpnEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteClientVpnEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteClientVpnEndpointRequest request]
    (-> this (.deleteClientVpnEndpointAsync request))))

(defn modify-volume-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ModifyVolumeAttribute. - `com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVolumeAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVolumeAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVolumeAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVolumeAttributeRequest request]
    (-> this (.modifyVolumeAttributeAsync request))))

(defn modify-transit-gateway-vpc-attachment-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyTransitGatewayVpcAttachmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyTransitGatewayVpcAttachmentRequest request]
    (-> this (.modifyTransitGatewayVpcAttachmentAsync request))))

(defn advertise-byoip-cidr-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AdvertiseByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AdvertiseByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.advertiseByoipCidrAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AdvertiseByoipCidrRequest request]
    (-> this (.advertiseByoipCidrAsync request))))

(defn associate-dhcp-options-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDhcpOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateDhcpOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDhcpOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateDhcpOptionsRequest request]
    (-> this (.associateDhcpOptionsAsync request))))

(defn create-default-vpc-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateDefaultVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDefaultVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateDefaultVpcResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateDefaultVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDefaultVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateDefaultVpcRequest request]
    (-> this (.createDefaultVpcAsync request))))

(defn describe-reserved-instances-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeReservedInstances. - `com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeReservedInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeReservedInstancesRequest request]
    (-> this (.describeReservedInstancesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeReservedInstancesAsync))))

(defn reject-transit-gateway-vpc-attachment-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectTransitGatewayVpcAttachmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RejectTransitGatewayVpcAttachmentRequest request]
    (-> this (.rejectTransitGatewayVpcAttachmentAsync request))))

(defn describe-flow-logs-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeFlowLogsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFlowLogs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFlowLogsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFlowLogsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFlowLogsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFlowLogsRequest request]
    (-> this (.describeFlowLogsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeFlowLogsAsync))))

(defn create-flow-logs-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateFlowLogsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFlowLogs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateFlowLogsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateFlowLogsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFlowLogsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateFlowLogsRequest request]
    (-> this (.createFlowLogsAsync request))))

(defn disassociate-route-table-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisassociateRouteTableRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateRouteTable operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateRouteTableResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateRouteTableRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateRouteTableAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateRouteTableRequest request]
    (-> this (.disassociateRouteTableAsync request))))

(defn replace-iam-instance-profile-association-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceIamInstanceProfileAssociation operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceIamInstanceProfileAssociationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReplaceIamInstanceProfileAssociationRequest request]
    (-> this (.replaceIamInstanceProfileAssociationAsync request))))

(defn update-security-group-rule-descriptions-egress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecurityGroupRuleDescriptionsEgress operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecurityGroupRuleDescriptionsEgressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UpdateSecurityGroupRuleDescriptionsEgressRequest request]
    (-> this (.updateSecurityGroupRuleDescriptionsEgressAsync request))))

(defn create-egress-only-internet-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEgressOnlyInternetGateway operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEgressOnlyInternetGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateEgressOnlyInternetGatewayRequest request]
    (-> this (.createEgressOnlyInternetGatewayAsync request))))

(defn delete-transit-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayRequest request]
    (-> this (.deleteTransitGatewayAsync request))))

(defn disable-ebs-encryption-by-default-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableEbsEncryptionByDefault operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableEbsEncryptionByDefaultAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableEbsEncryptionByDefaultRequest request]
    (-> this (.disableEbsEncryptionByDefaultAsync request))))

(defn modify-vpc-endpoint-service-configuration-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpointServiceConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointServiceConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointServiceConfigurationRequest request]
    (-> this (.modifyVpcEndpointServiceConfigurationAsync request))))

(defn describe-placement-groups-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePlacementGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePlacementGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePlacementGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePlacementGroupsRequest request]
    (-> this (.describePlacementGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describePlacementGroupsAsync))))

(defn delete-key-pair-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteKeyPairRequest request]
    (-> this (.deleteKeyPairAsync request))))

(defn cancel-reserved-instances-listing-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CancelReservedInstancesListing. - `com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelReservedInstancesListing operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelReservedInstancesListingResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelReservedInstancesListingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelReservedInstancesListingRequest request]
    (-> this (.cancelReservedInstancesListingAsync request))))

(defn create-customer-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateCustomerGateway. - `com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomerGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateCustomerGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomerGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateCustomerGatewayRequest request]
    (-> this (.createCustomerGatewayAsync request))))

(defn describe-import-snapshot-tasks-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImportSnapshotTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImportSnapshotTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeImportSnapshotTasksRequest request]
    (-> this (.describeImportSnapshotTasksAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeImportSnapshotTasksAsync))))

(defn describe-spot-datafeed-subscription-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeSpotDatafeedSubscription. - `com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSpotDatafeedSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSpotDatafeedSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSpotDatafeedSubscriptionRequest request]
    (-> this (.describeSpotDatafeedSubscriptionAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeSpotDatafeedSubscriptionAsync))))

(defn attach-vpn-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for AttachVpnGateway. - `com.amazonaws.services.ec2.model.AttachVpnGatewayRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachVpnGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachVpnGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachVpnGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachVpnGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachVpnGatewayRequest request]
    (-> this (.attachVpnGatewayAsync request))))

(defn modify-vpc-endpoint-connection-notification-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpointConnectionNotification operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointConnectionNotificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest request]
    (-> this (.modifyVpcEndpointConnectionNotificationAsync request))))

(defn create-client-vpn-endpoint-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClientVpnEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateClientVpnEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClientVpnEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateClientVpnEndpointRequest request]
    (-> this (.createClientVpnEndpointAsync request))))

(defn describe-launch-template-versions-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLaunchTemplateVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLaunchTemplateVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeLaunchTemplateVersionsRequest request]
    (-> this (.describeLaunchTemplateVersionsAsync request))))

(defn describe-fleet-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFleetInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFleetInstancesRequest request]
    (-> this (.describeFleetInstancesAsync request))))

(defn describe-regions-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeRegionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRegions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeRegionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeRegionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRegionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeRegionsRequest request]
    (-> this (.describeRegionsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeRegionsAsync))))

(defn describe-fpga-image-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFpgaImageAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFpgaImageAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeFpgaImageAttributeRequest request]
    (-> this (.describeFpgaImageAttributeAsync request))))

(defn modify-capacity-reservation-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyCapacityReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyCapacityReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyCapacityReservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyCapacityReservationRequest request]
    (-> this (.modifyCapacityReservationAsync request))))

(defn export-client-vpn-client-certificate-revocation-list-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportClientVpnClientCertificateRevocationList operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportClientVpnClientCertificateRevocationListAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ExportClientVpnClientCertificateRevocationListRequest request]
    (-> this (.exportClientVpnClientCertificateRevocationListAsync request))))

(defn authorize-security-group-egress-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AuthorizeSecurityGroupEgress operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.authorizeSecurityGroupEgressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest request]
    (-> this (.authorizeSecurityGroupEgressAsync request))))

(defn delete-security-group-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSecurityGroupResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest request]
    (-> this (.deleteSecurityGroupAsync request))))

(defn disassociate-address-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisassociateAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateAddressResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateAddressRequest request]
    (-> this (.disassociateAddressAsync request))))

(defn delete-vpc-endpoint-service-configurations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcEndpointServiceConfigurations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcEndpointServiceConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcEndpointServiceConfigurationsRequest request]
    (-> this (.deleteVpcEndpointServiceConfigurationsAsync request))))

(defn modify-reserved-instances-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ModifyReservedInstances. - `com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReservedInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyReservedInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReservedInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyReservedInstancesRequest request]
    (-> this (.modifyReservedInstancesAsync request))))

(defn associate-vpc-cidr-block-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateVpcCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateVpcCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateVpcCidrBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateVpcCidrBlockRequest request]
    (-> this (.associateVpcCidrBlockAsync request))))

(defn describe-tags-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeTagsAsync))))

(defn modify-client-vpn-endpoint-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyClientVpnEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyClientVpnEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyClientVpnEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyClientVpnEndpointRequest request]
    (-> this (.modifyClientVpnEndpointAsync request))))

(defn cancel-capacity-reservation-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CancelCapacityReservationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCapacityReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CancelCapacityReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelCapacityReservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelCapacityReservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CancelCapacityReservationRequest request]
    (-> this (.cancelCapacityReservationAsync request))))

(defn get-transit-gateway-attachment-propagations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTransitGatewayAttachmentPropagations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTransitGatewayAttachmentPropagationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetTransitGatewayAttachmentPropagationsRequest request]
    (-> this (.getTransitGatewayAttachmentPropagationsAsync request))))

(defn detach-internet-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DetachInternetGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachInternetGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DetachInternetGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachInternetGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachInternetGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DetachInternetGatewayRequest request]
    (-> this (.detachInternetGatewayAsync request))))

(defn assign-ipv-6-addresses-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssignIpv6Addresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssignIpv6AddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assignIpv6AddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssignIpv6AddressesRequest request]
    (-> this (.assignIpv6AddressesAsync request))))

(defn describe-availability-zones-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAvailabilityZones operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAvailabilityZonesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAvailabilityZonesRequest request]
    (-> this (.describeAvailabilityZonesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeAvailabilityZonesAsync))))

(defn attach-volume-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for AttachVolume. - `com.amazonaws.services.ec2.model.AttachVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AttachVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AttachVolumeRequest request]
    (-> this (.attachVolumeAsync request))))

(defn create-network-acl-entry-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNetworkAclEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNetworkAclEntryResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNetworkAclEntryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNetworkAclEntryRequest request]
    (-> this (.createNetworkAclEntryAsync request))))

(defn delete-transit-gateway-vpc-attachment-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTransitGatewayVpcAttachmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTransitGatewayVpcAttachmentRequest request]
    (-> this (.deleteTransitGatewayVpcAttachmentAsync request))))

(defn disable-transit-gateway-route-table-propagation-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableTransitGatewayRouteTablePropagation operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableTransitGatewayRouteTablePropagationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableTransitGatewayRouteTablePropagationRequest request]
    (-> this (.disableTransitGatewayRouteTablePropagationAsync request))))

(defn describe-vpc-classic-link-dns-support-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcClassicLinkDnsSupport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcClassicLinkDnsSupportAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkDnsSupportRequest request]
    (-> this (.describeVpcClassicLinkDnsSupportAsync request))))

(defn describe-volume-status-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVolumeStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVolumeStatusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVolumeStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVolumeStatusRequest request]
    (-> this (.describeVolumeStatusAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVolumeStatusAsync))))

(defn modify-vpc-peering-connection-options-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcPeeringConnectionOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcPeeringConnectionOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcPeeringConnectionOptionsRequest request]
    (-> this (.modifyVpcPeeringConnectionOptionsAsync request))))

(defn describe-vpc-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcAttributeRequest request]
    (-> this (.describeVpcAttributeAsync request))))

(defn describe-host-reservation-offerings-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHostReservationOfferings operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostReservationOfferingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeHostReservationOfferingsRequest request]
    (-> this (.describeHostReservationOfferingsAsync request))))

(defn describe-public-ipv-4-pools-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePublicIpv4Pools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePublicIpv4PoolsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePublicIpv4PoolsRequest request]
    (-> this (.describePublicIpv4PoolsAsync request))))

(defn reset-network-interface-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ResetNetworkInterfaceAttribute. - `com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetNetworkInterfaceAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetNetworkInterfaceAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ResetNetworkInterfaceAttributeRequest request]
    (-> this (.resetNetworkInterfaceAttributeAsync request))))

(defn create-client-vpn-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateClientVpnRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateClientVpnRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClientVpnRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateClientVpnRouteRequest request]
    (-> this (.createClientVpnRouteAsync request))))

(defn create-volume-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateVolume. - `com.amazonaws.services.ec2.model.CreateVolumeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVolume operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVolumeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVolumeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVolumeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVolumeRequest request]
    (-> this (.createVolumeAsync request))))

(defn delete-fleets-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteFleetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteFleetsRequest request]
    (-> this (.deleteFleetsAsync request))))

(defn associate-iam-instance-profile-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateIamInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AssociateIamInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateIamInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AssociateIamInstanceProfileRequest request]
    (-> this (.associateIamInstanceProfileAsync request))))

(defn unassign-ipv-6-addresses-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnassignIpv6Addresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UnassignIpv6AddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unassignIpv6AddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UnassignIpv6AddressesRequest request]
    (-> this (.unassignIpv6AddressesAsync request))))

(defn describe-subnets-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeSubnetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubnets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeSubnetsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSubnetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubnetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeSubnetsRequest request]
    (-> this (.describeSubnetsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeSubnetsAsync))))

(defn delete-nat-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteNatGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNatGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNatGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNatGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNatGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNatGatewayRequest request]
    (-> this (.deleteNatGatewayAsync request))))

(defn register-image-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for RegisterImage. - `com.amazonaws.services.ec2.model.RegisterImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RegisterImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RegisterImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RegisterImageRequest request]
    (-> this (.registerImageAsync request))))

(defn request-spot-fleet-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for RequestSpotFleet. - `com.amazonaws.services.ec2.model.RequestSpotFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RequestSpotFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.RequestSpotFleetResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RequestSpotFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.requestSpotFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.RequestSpotFleetRequest request]
    (-> this (.requestSpotFleetAsync request))))

(defn create-route-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateRouteRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateRouteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateRouteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRouteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateRouteRequest request]
    (-> this (.createRouteAsync request))))

(defn get-password-data-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.GetPasswordDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPasswordData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetPasswordDataResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetPasswordDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPasswordDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetPasswordDataRequest request]
    (-> this (.getPasswordDataAsync request))))

(defn disable-vgw-route-propagation-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DisableVgwRoutePropagation. - `com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableVgwRoutePropagation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableVgwRoutePropagationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableVgwRoutePropagationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableVgwRoutePropagationRequest request]
    (-> this (.disableVgwRoutePropagationAsync request))))

(defn purchase-host-reservation-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.PurchaseHostReservationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseHostReservation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.PurchaseHostReservationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.PurchaseHostReservationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseHostReservationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.PurchaseHostReservationRequest request]
    (-> this (.purchaseHostReservationAsync request))))

(defn create-transit-gateway-vpc-attachment-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransitGatewayVpcAttachment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransitGatewayVpcAttachmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateTransitGatewayVpcAttachmentRequest request]
    (-> this (.createTransitGatewayVpcAttachmentAsync request))))

(defn describe-egress-only-internet-gateways-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEgressOnlyInternetGateways operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEgressOnlyInternetGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeEgressOnlyInternetGatewaysRequest request]
    (-> this (.describeEgressOnlyInternetGatewaysAsync request))))

(defn delete-traffic-mirror-filter-rule-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTrafficMirrorFilterRule operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTrafficMirrorFilterRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteTrafficMirrorFilterRuleRequest request]
    (-> this (.deleteTrafficMirrorFilterRuleAsync request))))

(defn deregister-image-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeregisterImage. - `com.amazonaws.services.ec2.model.DeregisterImageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeregisterImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeregisterImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeregisterImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deregisterImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeregisterImageRequest request]
    (-> this (.deregisterImageAsync request))))

(defn copy-snapshot-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CopySnapshot. - `com.amazonaws.services.ec2.model.CopySnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopySnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CopySnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CopySnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copySnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CopySnapshotRequest request]
    (-> this (.copySnapshotAsync request))))

(defn report-instance-status-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ReportInstanceStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReportInstanceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ReportInstanceStatusResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReportInstanceStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reportInstanceStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ReportInstanceStatusRequest request]
    (-> this (.reportInstanceStatusAsync request))))

(defn delete-vpc-peering-connection-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVpcPeeringConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteVpcPeeringConnectionRequest request]
    (-> this (.deleteVpcPeeringConnectionAsync request))))

(defn describe-account-attributes-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeAccountAttributesAsync))))

(defn enable-volume-io-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for EnableVolumeIO. - `com.amazonaws.services.ec2.model.EnableVolumeIORequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableVolumeIO operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.EnableVolumeIOResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVolumeIORequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableVolumeIOAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.EnableVolumeIORequest request]
    (-> this (.enableVolumeIOAsync request))))

(defn describe-hosts-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeHostsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHosts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeHostsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeHostsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHostsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeHostsRequest request]
    (-> this (.describeHostsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeHostsAsync))))

(defn describe-vpc-classic-link-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcClassicLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcClassicLinkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcClassicLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcClassicLinkRequest request]
    (-> this (.describeVpcClassicLinkAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeVpcClassicLinkAsync))))

(defn modify-vpc-endpoint-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for ModifyVpcEndpoint. - `com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyVpcEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyVpcEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyVpcEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyVpcEndpointRequest request]
    (-> this (.modifyVpcEndpointAsync request))))

(defn create-reserved-instances-listing-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for CreateReservedInstancesListing. - `com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReservedInstancesListing operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateReservedInstancesListingResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReservedInstancesListingAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateReservedInstancesListingRequest request]
    (-> this (.createReservedInstancesListingAsync request))))

(defn disassociate-vpc-cidr-block-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateVpcCidrBlock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateVpcCidrBlockAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateVpcCidrBlockRequest request]
    (-> this (.disassociateVpcCidrBlockAsync request))))

(defn describe-moving-addresses-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeMovingAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeMovingAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeMovingAddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeMovingAddressesRequest request]
    (-> this (.describeMovingAddressesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeMovingAddressesAsync))))

(defn import-key-pair-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ImportKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportKeyPairRequest request]
    (-> this (.importKeyPairAsync request))))

(defn describe-route-tables-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeRouteTablesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRouteTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeRouteTablesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeRouteTablesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRouteTablesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeRouteTablesRequest request]
    (-> this (.describeRouteTablesAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeRouteTablesAsync))))

(defn delete-snapshot-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DeleteSnapshot. - `com.amazonaws.services.ec2.model.DeleteSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteSnapshotRequest request]
    (-> this (.deleteSnapshotAsync request))))

(defn get-reserved-instances-exchange-quote-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for GetReservedInstanceExchangeQuote. - `com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetReservedInstancesExchangeQuote operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getReservedInstancesExchangeQuoteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.GetReservedInstancesExchangeQuoteRequest request]
    (-> this (.getReservedInstancesExchangeQuoteAsync request))))

(defn import-image-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ImportImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportImageRequest request]
    (-> this (.importImageAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.importImageAsync))))

(defn modify-instance-credit-specification-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyInstanceCreditSpecification operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyInstanceCreditSpecificationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ModifyInstanceCreditSpecificationRequest request]
    (-> this (.modifyInstanceCreditSpecificationAsync request))))

(defn unmonitor-instances-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.UnmonitorInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnmonitorInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.UnmonitorInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UnmonitorInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unmonitorInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.UnmonitorInstancesRequest request]
    (-> this (.unmonitorInstancesAsync request))))

(defn delete-network-acl-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DeleteNetworkAclRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNetworkAcl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DeleteNetworkAclResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkAclRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNetworkAclAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DeleteNetworkAclRequest request]
    (-> this (.deleteNetworkAclAsync request))))

(defn describe-client-vpn-connections-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeClientVpnConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClientVpnConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeClientVpnConnectionsRequest request]
    (-> this (.describeClientVpnConnectionsAsync request))))

(defn describe-transit-gateway-vpc-attachments-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransitGatewayVpcAttachments operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransitGatewayVpcAttachmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeTransitGatewayVpcAttachmentsRequest request]
    (-> this (.describeTransitGatewayVpcAttachmentsAsync request))))

(defn describe-vpc-endpoint-service-configurations-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointServiceConfigurations operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointServiceConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointServiceConfigurationsRequest request]
    (-> this (.describeVpcEndpointServiceConfigurationsAsync request))))

(defn copy-fpga-image-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CopyFpgaImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyFpgaImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CopyFpgaImageResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CopyFpgaImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyFpgaImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CopyFpgaImageRequest request]
    (-> this (.copyFpgaImageAsync request))))

(defn accept-reserved-instances-exchange-quote-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for accepting the quote. - `com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptReservedInstancesExchangeQuote operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptReservedInstancesExchangeQuoteAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.AcceptReservedInstancesExchangeQuoteRequest request]
    (-> this (.acceptReservedInstancesExchangeQuoteAsync request))))

(defn disable-vpc-classic-link-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableVpcClassicLink operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisableVpcClassicLinkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableVpcClassicLinkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisableVpcClassicLinkRequest request]
    (-> this (.disableVpcClassicLinkAsync request))))

(defn create-vpc-peering-connection-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVpcPeeringConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateVpcPeeringConnectionRequest request]
    (-> this (.createVpcPeeringConnectionAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.createVpcPeeringConnectionAsync))))

(defn describe-vpc-endpoint-connections-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVpcEndpointConnections operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVpcEndpointConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeVpcEndpointConnectionsRequest request]
    (-> this (.describeVpcEndpointConnectionsAsync request))))

(defn disassociate-client-vpn-target-network-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateClientVpnTargetNetwork operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateClientVpnTargetNetworkAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DisassociateClientVpnTargetNetworkRequest request]
    (-> this (.disassociateClientVpnTargetNetworkAsync request))))

(defn describe-customer-gateways-async
  "Description copied from interface: AmazonEC2Async

  request - Contains the parameters for DescribeCustomerGateways. - `com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCustomerGateways operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCustomerGatewaysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest request]
    (-> this (.describeCustomerGatewaysAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describeCustomerGatewaysAsync))))

(defn import-client-vpn-client-certificate-revocation-list-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportClientVpnClientCertificateRevocationList operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importClientVpnClientCertificateRevocationListAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ImportClientVpnClientCertificateRevocationListRequest request]
    (-> this (.importClientVpnClientCertificateRevocationListAsync request))))

(defn describe-instance-attribute-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeInstanceAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeInstanceAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeInstanceAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeInstanceAttributeRequest request]
    (-> this (.describeInstanceAttributeAsync request))))

(defn describe-stale-security-groups-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStaleSecurityGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStaleSecurityGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribeStaleSecurityGroupsRequest request]
    (-> this (.describeStaleSecurityGroupsAsync request))))

(defn provision-byoip-cidr-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ProvisionByoipCidr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.ProvisionByoipCidrResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.provisionByoipCidrAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.ProvisionByoipCidrRequest request]
    (-> this (.provisionByoipCidrAsync request))))

(defn describe-prefix-lists-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.DescribePrefixListsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePrefixLists operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.DescribePrefixListsResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePrefixListsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePrefixListsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.DescribePrefixListsRequest request]
    (-> this (.describePrefixListsAsync request)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this]
    (-> this (.describePrefixListsAsync))))

(defn create-nat-gateway-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateNatGatewayRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNatGateway operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateNatGatewayResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNatGatewayRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNatGatewayAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateNatGatewayRequest request]
    (-> this (.createNatGatewayAsync request))))

(defn create-launch-template-async
  "Description copied from interface: AmazonEC2Async

  request - `com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLaunchTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.ec2.model.CreateLaunchTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLaunchTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonEC2AsyncClient this ^com.amazonaws.services.ec2.model.CreateLaunchTemplateRequest request]
    (-> this (.createLaunchTemplateAsync request))))

