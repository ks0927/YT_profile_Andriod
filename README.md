# YT_profile_Andriod
자주 보는 3명의 유튜버 프로필을 보여주는 간단 안드로이드 어플   
랜덤한 명언을 보여주는 간단 안드로이드 어플   
네비게이션과 프래그먼트, RecyclerView를 위한 study app

4월 1일 study: Element :네비게이션, 프래그먼트,RecyclerView...etc

    네비게이션과 프래그먼트
        1. new-> resource file -> navigation생성 
        2. main xml design의 containers에서 NavHostFragment 만든nav끌어오기
        3. fragment 3개 생성하고 nav의 xml에서 new destinations로 fragment 3개 가져오고 서로 이어주기
        4. fragment로 와서 안쓰는거 지우고 정리해주고 xml연결하고 이미지 연결해준뒤 
        it.findNavController().navigate(~~)로 fragment이동설정
    
    RecyclerView
        1. fragment xml에 recyclerview 생성
        2. rvadapter 생성:
        RVAdapter(val items: MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() 후 3개 함수 override
        item을 받아올 xml 생성한뒤 textview 생성
        	onCreateViewHolder함수 ->  val view  = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        		                         return ViewHolder(view)  // item xml하고 연결
        	onBindViewHolder함수 -> holder.bindItems(items[position])  //하나씩 값 가져오기
        	getItemCount함수 -> return items.size    //사이즈 반환
        	ViewHolder함수 -> fun bindItems(item : String){
                    		val rv_text = itemView.findViewById<TextView>(R.id.rvTextid) //item xml의 TextView와 연결
                    		rv_text.text = item}
        3. fragment에서 mutablelist만들어서 값 넣은뒤  fragment xml의 recyclerview와 연결(RVAdapter 사용해서)
        4. rv.layoutManager = LinearLayoutManager(context) 까지 작성