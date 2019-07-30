(ns com.amazonaws.services.directconnect.AmazonDirectConnect
  "Interface for accessing AWS Direct Connect.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonDirectConnect instead.



  AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
  cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. With this
  connection in place, you can create virtual interfaces directly to the AWS cloud (for example, to Amazon EC2 and
  Amazon S3) and to Amazon VPC, bypassing Internet service providers in your network path. A connection provides access
  to all AWS Regions except the China (Beijing) and (China) Ningxia Regions. AWS resources in the China Regions can
  only be accessed through locations associated with those Regions."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.directconnect AmazonDirectConnect]))

(defn describe-direct-connect-gateway-attachments
  "Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct
   Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all
   virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response
   contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response
   contains the attachment between the Direct Connect gateway and the virtual interface.

  describe-direct-connect-gateway-attachments-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest`

  returns: Result of the DescribeDirectConnectGatewayAttachments operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAttachmentsRequest describe-direct-connect-gateway-attachments-request]
    (-> this (.describeDirectConnectGatewayAttachments describe-direct-connect-gateway-attachments-request))))

(defn describe-direct-connect-gateways
  "Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect
   gateways are not returned.

  describe-direct-connect-gateways-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest`

  returns: Result of the DescribeDirectConnectGateways operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewaysRequest describe-direct-connect-gateways-request]
    (-> this (.describeDirectConnectGateways describe-direct-connect-gateways-request))))

(defn allocate-hosted-connection
  "Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects.


   Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the
   specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and
   the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.



   Intended for use by AWS Direct Connect Partners only.

  allocate-hosted-connection-request - `com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest`

  returns: Result of the AllocateHostedConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.AllocateHostedConnectionResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocateHostedConnectionRequest allocate-hosted-connection-request]
    (-> this (.allocateHostedConnection allocate-hosted-connection-request))))

(defn delete-connection
  "Deletes the specified connection.


   Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are
   partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service
   with them separately.

  delete-connection-request - `com.amazonaws.services.directconnect.model.DeleteConnectionRequest`

  returns: Result of the DeleteConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteConnectionResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteConnectionResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteConnectionRequest delete-connection-request]
    (-> this (.deleteConnection delete-connection-request))))

(defn create-public-virtual-interface
  "Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A
   public virtual interface supports sending traffic to public services of AWS such as Amazon S3.


   When creating an IPv6 public virtual interface (addressFamily is ipv6), leave the
   customer and amazon address fields blank to use auto-assigned IPv6 space. Custom IPv6
   addresses are not supported.

  create-public-virtual-interface-request - `com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest`

  returns: Result of the CreatePublicVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreatePublicVirtualInterfaceRequest create-public-virtual-interface-request]
    (-> this (.createPublicVirtualInterface create-public-virtual-interface-request))))

(defn describe-tags
  "Describes the tags associated with the specified AWS Direct Connect resources.

  describe-tags-request - `com.amazonaws.services.directconnect.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeTagsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeTagsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTags describe-tags-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonDirectConnect this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn associate-virtual-interface
  "Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS
   is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an
   associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails.


   Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must
   be migrated along with their virtual interfaces using AssociateHostedConnection.


   To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
   interface itself or the connection to which the virtual interface is currently associated. Additionally, the
   requester must own the connection or LAG for the association.

  associate-virtual-interface-request - `com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest`

  returns: Result of the AssociateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AssociateVirtualInterfaceRequest associate-virtual-interface-request]
    (-> this (.associateVirtualInterface associate-virtual-interface-request))))

(defn accept-direct-connect-gateway-association-proposal
  "Accepts a proposal request to attach a virtual private gateway or transit gateway to a Direct Connect gateway.

  accept-direct-connect-gateway-association-proposal-request - `com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest`

  returns: Result of the AcceptDirectConnectGatewayAssociationProposal operation returned by the service. - `com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AcceptDirectConnectGatewayAssociationProposalRequest accept-direct-connect-gateway-association-proposal-request]
    (-> this (.acceptDirectConnectGatewayAssociationProposal accept-direct-connect-gateway-association-proposal-request))))

(defn delete-direct-connect-gateway
  "Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to
   the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct
   Connect gateway.

  delete-direct-connect-gateway-request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest`

  returns: Result of the DeleteDirectConnectGateway operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayRequest delete-direct-connect-gateway-request]
    (-> this (.deleteDirectConnectGateway delete-direct-connect-gateway-request))))

(defn confirm-transit-virtual-interface
  "Accepts ownership of a transit virtual interface created by another AWS account.


   After the owner of the transit virtual interface makes this call, the specified transit virtual interface is
   created and made available to handle traffic.

  confirm-transit-virtual-interface-request - `com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest`

  returns: Result of the ConfirmTransitVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmTransitVirtualInterfaceRequest confirm-transit-virtual-interface-request]
    (-> this (.confirmTransitVirtualInterface confirm-transit-virtual-interface-request))))

(defn describe-interconnect-loa
  "Deprecated.

  describe-interconnect-loa-request - `com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest`

  returns: Result of the DescribeInterconnectLoa operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeInterconnectLoaRequest describe-interconnect-loa-request]
    (-> this (.describeInterconnectLoa describe-interconnect-loa-request))))

(defn describe-lags
  "Describes all your link aggregation groups (LAG) or the specified LAG.

  describe-lags-request - `com.amazonaws.services.directconnect.model.DescribeLagsRequest`

  returns: Result of the DescribeLags operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeLagsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeLagsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeLagsRequest describe-lags-request]
    (-> this (.describeLags describe-lags-request))))

(defn describe-connections
  "Displays the specified connection or all connections in this Region.

  describe-connections-request - `com.amazonaws.services.directconnect.model.DescribeConnectionsRequest`

  returns: Result of the DescribeConnections operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeConnectionsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeConnectionsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeConnectionsRequest describe-connections-request]
    (-> this (.describeConnections describe-connections-request)))
  (^com.amazonaws.services.directconnect.model.DescribeConnectionsResult [^AmazonDirectConnect this]
    (-> this (.describeConnections))))

(defn update-direct-connect-gateway-association
  "Updates the specified attributes of the Direct Connect gateway association.


   Add or remove prefixes from the association.

  update-direct-connect-gateway-association-request - `com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest`

  returns: Result of the UpdateDirectConnectGatewayAssociation operation returned by the service. - `com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UpdateDirectConnectGatewayAssociationRequest update-direct-connect-gateway-association-request]
    (-> this (.updateDirectConnectGatewayAssociation update-direct-connect-gateway-association-request))))

(defn untag-resource
  "Removes one or more tags from the specified AWS Direct Connect resource.

  untag-resource-request - `com.amazonaws.services.directconnect.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.directconnect.model.UntagResourceResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.UntagResourceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn delete-bgp-peer
  "Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN.


   You cannot delete the last BGP peer from a virtual interface.

  delete-bgp-peer-request - `com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest`

  returns: Result of the DeleteBGPPeer operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteBGPPeerResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteBGPPeerResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteBGPPeerRequest delete-bgp-peer-request]
    (-> this (.deleteBGPPeer delete-bgp-peer-request))))

(defn describe-virtual-interfaces
  "Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you
   make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with
   the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is
   returned.


   A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer
   network.

  describe-virtual-interfaces-request - `com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest`

  returns: Result of the DescribeVirtualInterfaces operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesRequest describe-virtual-interfaces-request]
    (-> this (.describeVirtualInterfaces describe-virtual-interfaces-request)))
  (^com.amazonaws.services.directconnect.model.DescribeVirtualInterfacesResult [^AmazonDirectConnect this]
    (-> this (.describeVirtualInterfaces))))

(defn allocate-public-virtual-interface
  "Provisions a public virtual interface to be owned by the specified AWS account.


   The owner of a connection calls this function to provision a public virtual interface to be owned by the
   specified AWS account.


   Virtual interfaces created using this function must be confirmed by the owner using
   ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface is in the
   confirming state and is not available to handle traffic.


   When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are
   automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.

  allocate-public-virtual-interface-request - `com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest`

  returns: Result of the AllocatePublicVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocatePublicVirtualInterfaceRequest allocate-public-virtual-interface-request]
    (-> this (.allocatePublicVirtualInterface allocate-public-virtual-interface-request))))

(defn delete-direct-connect-gateway-association
  "Deletes the association between the specified Direct Connect gateway and virtual private gateway.

  delete-direct-connect-gateway-association-request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest`

  returns: Result of the DeleteDirectConnectGatewayAssociation operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationRequest delete-direct-connect-gateway-association-request]
    (-> this (.deleteDirectConnectGatewayAssociation delete-direct-connect-gateway-association-request))))

(defn confirm-connection
  "Confirms the creation of the specified hosted connection on an interconnect.


   Upon creation, the hosted connection is initially in the Ordering state, and remains in this state
   until the owner confirms creation of the hosted connection.

  confirm-connection-request - `com.amazonaws.services.directconnect.model.ConfirmConnectionRequest`

  returns: Result of the ConfirmConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmConnectionResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.ConfirmConnectionResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmConnectionRequest confirm-connection-request]
    (-> this (.confirmConnection confirm-connection-request))))

(defn allocate-private-virtual-interface
  "Provisions a private virtual interface to be owned by the specified AWS account.


   Virtual interfaces created using this action must be confirmed by the owner using
   ConfirmPrivateVirtualInterface. Until then, the virtual interface is in the Confirming state
   and is not available to handle traffic.

  allocate-private-virtual-interface-request - `com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest`

  returns: Result of the AllocatePrivateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocatePrivateVirtualInterfaceRequest allocate-private-virtual-interface-request]
    (-> this (.allocatePrivateVirtualInterface allocate-private-virtual-interface-request))))

(defn confirm-public-virtual-interface
  "Accepts ownership of a public virtual interface created by another AWS account.


   After the virtual interface owner makes this call, the specified virtual interface is created and made available
   to handle traffic.

  confirm-public-virtual-interface-request - `com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest`

  returns: Result of the ConfirmPublicVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmPublicVirtualInterfaceRequest confirm-public-virtual-interface-request]
    (-> this (.confirmPublicVirtualInterface confirm-public-virtual-interface-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonDirectConnect this]
    (-> this (.shutdown))))

(defn allocate-connection-on-interconnect
  "Deprecated.

  allocate-connection-on-interconnect-request - `com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest`

  returns: Result of the AllocateConnectionOnInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocateConnectionOnInterconnectRequest allocate-connection-on-interconnect-request]
    (-> this (.allocateConnectionOnInterconnect allocate-connection-on-interconnect-request))))

(defn describe-loa
  "Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).


   The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
   establishing your cross connect to AWS at the colocation facility. For more information, see Requesting Cross Connects at
   AWS Direct Connect Locations in the AWS Direct Connect User Guide.

  describe-loa-request - `com.amazonaws.services.directconnect.model.DescribeLoaRequest`

  returns: Result of the DescribeLoa operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeLoaResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeLoaResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeLoaRequest describe-loa-request]
    (-> this (.describeLoa describe-loa-request))))

(defn delete-lag
  "Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces
   or hosted connections.

  delete-lag-request - `com.amazonaws.services.directconnect.model.DeleteLagRequest`

  returns: Result of the DeleteLag operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteLagResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteLagResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteLagRequest delete-lag-request]
    (-> this (.deleteLag delete-lag-request))))

(defn describe-hosted-connections
  "Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group
   (LAG).



   Intended for use by AWS Direct Connect Partners only.

  describe-hosted-connections-request - `com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest`

  returns: Result of the DescribeHostedConnections operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeHostedConnectionsRequest describe-hosted-connections-request]
    (-> this (.describeHostedConnections describe-hosted-connections-request))))

(defn create-direct-connect-gateway-association-proposal
  "Creates a proposal to associate the specified virtual private gateway or transit gateway with the specified
   Direct Connect gateway.


   You can only associate a Direct Connect gateway and virtual private gateway or transit gateway when the account
   that owns the Direct Connect gateway and the account that owns the virtual private gateway or transit gateway
   have the same AWS Payer ID.

  create-direct-connect-gateway-association-proposal-request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest`

  returns: Result of the CreateDirectConnectGatewayAssociationProposal operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationProposalRequest create-direct-connect-gateway-association-proposal-request]
    (-> this (.createDirectConnectGatewayAssociationProposal create-direct-connect-gateway-association-proposal-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"directconnect.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://directconnect.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonDirectConnect this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-locations
  "Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected
   when calling CreateConnection or CreateInterconnect.

  describe-locations-request - `com.amazonaws.services.directconnect.model.DescribeLocationsRequest`

  returns: Result of the DescribeLocations operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeLocationsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeLocationsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeLocationsRequest describe-locations-request]
    (-> this (.describeLocations describe-locations-request)))
  (^com.amazonaws.services.directconnect.model.DescribeLocationsResult [^AmazonDirectConnect this]
    (-> this (.describeLocations))))

(defn describe-connection-loa
  "Deprecated.

  describe-connection-loa-request - `com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest`

  returns: Result of the DescribeConnectionLoa operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeConnectionLoaResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeConnectionLoaRequest describe-connection-loa-request]
    (-> this (.describeConnectionLoa describe-connection-loa-request))))

(defn create-connection
  "Creates a connection between a customer network and a specific AWS Direct Connect location.


   A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
   cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router.


   To find the locations for your Region, use DescribeLocations.


   You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
   request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
   specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.

  create-connection-request - `com.amazonaws.services.directconnect.model.CreateConnectionRequest`

  returns: Result of the CreateConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateConnectionResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.CreateConnectionResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateConnectionRequest create-connection-request]
    (-> this (.createConnection create-connection-request))))

(defn delete-direct-connect-gateway-association-proposal
  "Deletes the association proposal request between the specified Direct Connect gateway and virtual private gateway
   or transit gateway.

  delete-direct-connect-gateway-association-proposal-request - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest`

  returns: Result of the DeleteDirectConnectGatewayAssociationProposal operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteDirectConnectGatewayAssociationProposalRequest delete-direct-connect-gateway-association-proposal-request]
    (-> this (.deleteDirectConnectGatewayAssociationProposal delete-direct-connect-gateway-association-proposal-request))))

(defn create-direct-connect-gateway-association
  "Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private
   gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.

  create-direct-connect-gateway-association-request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest`

  returns: Result of the CreateDirectConnectGatewayAssociation operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayAssociationRequest create-direct-connect-gateway-association-request]
    (-> this (.createDirectConnectGatewayAssociation create-direct-connect-gateway-association-request))))

(defn update-lag
  "Updates the attributes of the specified link aggregation group (LAG).


   You can update the following attributes:




   The name of the LAG.




   The value for the minimum number of connections that must be operational for the LAG itself to be operational.




   When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you
   update this value and the number of operational connections falls below the specified value, the LAG
   automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as
   it could force the LAG down if it is set higher than the current number of operational connections.

  update-lag-request - `com.amazonaws.services.directconnect.model.UpdateLagRequest`

  returns: Result of the UpdateLag operation returned by the service. - `com.amazonaws.services.directconnect.model.UpdateLagResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.UpdateLagResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UpdateLagRequest update-lag-request]
    (-> this (.updateLag update-lag-request))))

(defn create-transit-virtual-interface
  "Creates a transit virtual interface. A transit virtual interface should be used to access one or more transit
   gateways associated with Direct Connect gateways. A transit virtual interface enables the connection of multiple
   VPCs attached to a transit gateway to a Direct Connect gateway.



   If you associate your transit gateway with one or more Direct Connect gateways, the Autonomous System Number
   (ASN) used by the transit gateway and the Direct Connect gateway must be different. For example, if you use the
   default ASN 64512 for both your the transit gateway and Direct Connect gateway, the association request fails.

  create-transit-virtual-interface-request - `com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest`

  returns: Result of the CreateTransitVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateTransitVirtualInterfaceRequest create-transit-virtual-interface-request]
    (-> this (.createTransitVirtualInterface create-transit-virtual-interface-request))))

(defn update-virtual-interface-attributes
  "Updates the specified attributes of the specified virtual private interface.


   Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical
   connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity
   for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection
   supports jumbo frames, call DescribeConnections. To check whether your virtual interface supports jumbo
   frames, call DescribeVirtualInterfaces.

  update-virtual-interface-attributes-request - `com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest`

  returns: Result of the UpdateVirtualInterfaceAttributes operation returned by the service. - `com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.UpdateVirtualInterfaceAttributesRequest update-virtual-interface-attributes-request]
    (-> this (.updateVirtualInterfaceAttributes update-virtual-interface-attributes-request))))

(defn confirm-private-virtual-interface
  "Accepts ownership of a private virtual interface created by another AWS account.


   After the virtual interface owner makes this call, the virtual interface is created and attached to the specified
   virtual private gateway or Direct Connect gateway, and is made available to handle traffic.

  confirm-private-virtual-interface-request - `com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest`

  returns: Result of the ConfirmPrivateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.ConfirmPrivateVirtualInterfaceRequest confirm-private-virtual-interface-request]
    (-> this (.confirmPrivateVirtualInterface confirm-private-virtual-interface-request))))

(defn create-private-virtual-interface
  "Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic.
   A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway
   (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for
   connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to
   a VGW only provides access to a single VPC within the same Region.

  create-private-virtual-interface-request - `com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest`

  returns: Result of the CreatePrivateVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreatePrivateVirtualInterfaceRequest create-private-virtual-interface-request]
    (-> this (.createPrivateVirtualInterface create-private-virtual-interface-request))))

(defn create-bgp-peer
  "Creates a BGP peer on the specified virtual interface.


   You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that
   also use that address family.


   If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the
   same address family as an existing BGP peer on the virtual interface.


   When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically
   assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.


   For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
   virtual interface.

  create-bgp-peer-request - `com.amazonaws.services.directconnect.model.CreateBGPPeerRequest`

  returns: Result of the CreateBGPPeer operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateBGPPeerResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.CreateBGPPeerResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateBGPPeerRequest create-bgp-peer-request]
    (-> this (.createBGPPeer create-bgp-peer-request))))

(defn disassociate-connection-from-lag
  "Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established
   as a standalone connection (the connection is not deleted; to delete the connection, use the
   DeleteConnection request). If the LAG has associated virtual interfaces or hosted connections, they remain
   associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically
   converted to an interconnect.


   If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational
   connections, the request fails, except when it's the last member of the LAG. If all connections are
   disassociated, the LAG continues to exist as an empty LAG with no physical connections.

  disassociate-connection-from-lag-request - `com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest`

  returns: Result of the DisassociateConnectionFromLag operation returned by the service. - `com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DisassociateConnectionFromLagRequest disassociate-connection-from-lag-request]
    (-> this (.disassociateConnectionFromLag disassociate-connection-from-lag-request))))

(defn create-interconnect
  "Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect
   location.


   An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can
   use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network
   services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect
   location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to
   an AWS Direct Connect router.


   You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
   request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
   the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is
   created.


   For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling
   AllocateHostedConnection. The end customer can then connect to AWS resources by creating a virtual
   interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.



   Intended for use by AWS Direct Connect Partners only.

  create-interconnect-request - `com.amazonaws.services.directconnect.model.CreateInterconnectRequest`

  returns: Result of the CreateInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateInterconnectResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.CreateInterconnectResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateInterconnectRequest create-interconnect-request]
    (-> this (.createInterconnect create-interconnect-request))))

(defn describe-virtual-gateways
  "Lists the virtual private gateways owned by the AWS account.


   You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.

  describe-virtual-gateways-request - `com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest`

  returns: Result of the DescribeVirtualGateways operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysRequest describe-virtual-gateways-request]
    (-> this (.describeVirtualGateways describe-virtual-gateways-request)))
  (^com.amazonaws.services.directconnect.model.DescribeVirtualGatewaysResult [^AmazonDirectConnect this]
    (-> this (.describeVirtualGateways))))

(defn delete-interconnect
  "Deletes the specified interconnect.



   Intended for use by AWS Direct Connect Partners only.

  delete-interconnect-request - `com.amazonaws.services.directconnect.model.DeleteInterconnectRequest`

  returns: Result of the DeleteInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteInterconnectResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteInterconnectResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteInterconnectRequest delete-interconnect-request]
    (-> this (.deleteInterconnect delete-interconnect-request))))

(defn describe-direct-connect-gateway-association-proposals
  "Describes one or more association proposals for connection between a virtual private gateway or transit gateway
   and a Direct Connect gateway.

  describe-direct-connect-gateway-association-proposals-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest`

  returns: Result of the DescribeDirectConnectGatewayAssociationProposals operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationProposalsRequest describe-direct-connect-gateway-association-proposals-request]
    (-> this (.describeDirectConnectGatewayAssociationProposals describe-direct-connect-gateway-association-proposals-request))))

(defn create-lag
  "Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the
   customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
   Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single
   interface.


   All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint.


   You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG
   than AWS Direct Connect can allocate on a single endpoint, no LAG is created.


   You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the
   total number of connections). Doing so interrupts the current physical connection or hosted connections, and
   re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to
   which the connection terminates. Any virtual interfaces associated with the connection are automatically
   disassociated and re-associated with the LAG. The connection ID does not change.


   If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically
   enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
   directly configured.

  create-lag-request - `com.amazonaws.services.directconnect.model.CreateLagRequest`

  returns: Result of the CreateLag operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateLagResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.CreateLagResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateLagRequest create-lag-request]
    (-> this (.createLag create-lag-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonDirectConnect this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn delete-virtual-interface
  "Deletes a virtual interface.

  delete-virtual-interface-request - `com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest`

  returns: Result of the DeleteVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DeleteVirtualInterfaceRequest delete-virtual-interface-request]
    (-> this (.deleteVirtualInterface delete-virtual-interface-request))))

(defn describe-connections-on-interconnect
  "Deprecated.

  describe-connections-on-interconnect-request - `com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest`

  returns: Result of the DescribeConnectionsOnInterconnect operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeConnectionsOnInterconnectRequest describe-connections-on-interconnect-request]
    (-> this (.describeConnectionsOnInterconnect describe-connections-on-interconnect-request))))

(defn associate-hosted-connection
  "Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If
   the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address,
   the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is
   being migrated.



   Intended for use by AWS Direct Connect Partners only.

  associate-hosted-connection-request - `com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest`

  returns: Result of the AssociateHostedConnection operation returned by the service. - `com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.AssociateHostedConnectionResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AssociateHostedConnectionRequest associate-hosted-connection-request]
    (-> this (.associateHostedConnection associate-hosted-connection-request))))

(defn create-direct-connect-gateway
  "Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual
   interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after
   it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect
   gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the
   Region in which the virtual interfaces are located, and pass traffic between them.

  create-direct-connect-gateway-request - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest`

  returns: Result of the CreateDirectConnectGateway operation returned by the service. - `com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.CreateDirectConnectGatewayRequest create-direct-connect-gateway-request]
    (-> this (.createDirectConnectGateway create-direct-connect-gateway-request))))

(defn tag-resource
  "Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50
   tags.


   Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
   resource, this action updates its value.

  tag-resource-request - `com.amazonaws.services.directconnect.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.directconnect.model.TagResourceResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.TagResourceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn associate-connection-with-lag
  "Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and
   re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the
   same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
   re-associate a connection that's currently associated with a different LAG; however, if removing the connection
   would cause the original LAG to fall below its setting for minimum number of operational connections, the request
   fails.


   Any virtual interfaces that are directly associated with the connection are automatically re-associated with the
   LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated
   with the original LAG.


   For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was
   originally associated with a different LAG, the hosted connections remain associated with the original LAG.

  associate-connection-with-lag-request - `com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest`

  returns: Result of the AssociateConnectionWithLag operation returned by the service. - `com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AssociateConnectionWithLagRequest associate-connection-with-lag-request]
    (-> this (.associateConnectionWithLag associate-connection-with-lag-request))))

(defn allocate-transit-virtual-interface
  "Provisions a transit virtual interface to be owned by the specified AWS account. Use this type of interface to
   connect a transit gateway to your Direct Connect gateway.


   The owner of a connection provisions a transit virtual interface to be owned by the specified AWS account.


   After you create a transit virtual interface, it must be confirmed by the owner using
   ConfirmTransitVirtualInterface. Until this step has been completed, the transit virtual interface is in
   the requested state and is not available to handle traffic.

  allocate-transit-virtual-interface-request - `com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest`

  returns: Result of the AllocateTransitVirtualInterface operation returned by the service. - `com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceResult`

  throws: com.amazonaws.services.directconnect.model.DuplicateTagKeysException - A tag key was specified more than once."
  (^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.AllocateTransitVirtualInterfaceRequest allocate-transit-virtual-interface-request]
    (-> this (.allocateTransitVirtualInterface allocate-transit-virtual-interface-request))))

(defn describe-direct-connect-gateway-associations
  "Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a
   Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response
   contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual
   private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway.
   If you specify both, the response contains the association between the Direct Connect gateway and the virtual
   private gateway.

  describe-direct-connect-gateway-associations-request - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest`

  returns: Result of the DescribeDirectConnectGatewayAssociations operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeDirectConnectGatewayAssociationsRequest describe-direct-connect-gateway-associations-request]
    (-> this (.describeDirectConnectGatewayAssociations describe-direct-connect-gateway-associations-request))))

(defn describe-interconnects
  "Lists the interconnects owned by the AWS account or only the specified interconnect.

  describe-interconnects-request - `com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest`

  returns: Result of the DescribeInterconnects operation returned by the service. - `com.amazonaws.services.directconnect.model.DescribeInterconnectsResult`

  throws: com.amazonaws.services.directconnect.model.DirectConnectServerException - A server-side error occurred."
  (^com.amazonaws.services.directconnect.model.DescribeInterconnectsResult [^AmazonDirectConnect this ^com.amazonaws.services.directconnect.model.DescribeInterconnectsRequest describe-interconnects-request]
    (-> this (.describeInterconnects describe-interconnects-request)))
  (^com.amazonaws.services.directconnect.model.DescribeInterconnectsResult [^AmazonDirectConnect this]
    (-> this (.describeInterconnects))))

